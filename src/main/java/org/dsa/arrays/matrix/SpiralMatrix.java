package org.dsa.arrays.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length -1;
        int direction = 0;
        List<Integer> list = new ArrayList<>();
        while(left<=right && top<=bottom){
            if(direction == 0){
                for(int i = left;i<=right;i++){
                    list.add(matrix[top][i]);
                }
                top++;

            }
            if(direction == 1){
                for(int i = top;i<=bottom;i++){
                    list.add(matrix[i][right]);
                }
                right--;

            }
            if(direction == 2){
                for(int i = right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(direction == 3){
                for(int i = bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }

            direction = (direction+1)%4;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> list = spiralOrder(matrix);
        list.forEach(System.out::println);
    }
}
