package org.dsa.arrays.matrix;

public class RotateImage {
    static void rotate(int[][] image) {
        int n = image.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = image[n - 1 - j][i];
                //bottom left = bottom right
                image[n - 1 - j][i] = image[n - 1 - i][n - 1-j];

                //bottom right = top right
                image[n - 1 - i][n -1-j] = image[j][n - 1 - i];

                // top right = top left
                image[j][n - 1 - i] = image[i][j];

                image[i][j] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(matrix);
       printMatrix(matrix);
    }
}
