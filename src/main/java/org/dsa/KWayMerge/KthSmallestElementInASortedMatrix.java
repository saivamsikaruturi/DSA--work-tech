package org.dsa.KWayMerge;

import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix {

    public static void main(String[] args) {
        System.out.println(kthSmallestUsingHeap(new int[][]{{1,5,9},{10,11,13},{12,13,15}},  8));
        System.out.println(kthSmallest(new int[][]{{1,5,9},{10,11,13},{12,13,15}},  8));
    }

    public static int kthSmallestUsingHeap(int[][] matrix, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b)->b-a);

        for(int i = 0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                queue.add(matrix[i][j]);

                if(queue.size()>k){
                    queue.remove();
                }
            }
        }
        return queue.peek();
    }

    public  static  int kthSmallest(int[][] matrix,int k){
             int n = matrix.length;
             int left = matrix[0][0];
             int right = matrix[n-1][n-1];

             while(left < right)
             {
                 int mid = left +(right-left)/2;
                 int count = getRank(matrix,mid);
                 if(count < k){
                     left = mid+1;
                 }
                 else{
                     right = mid;
                 }
             }

             return left;
    }

    private static int getRank(int[][] matrix, int mid) {
        int n = matrix[0].length;
        int row = matrix.length-1;
        int col = 0;
        int count = 0;

        while(row >= 0 && col < n){

            if(matrix[row][col] <= mid){
                count += (row + 1);
                col++;
            }
            else{
                row--;
            }
        }

        return count;
    }
}
