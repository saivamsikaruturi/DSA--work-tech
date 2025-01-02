package org.dsa.arrays.matrix;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeros(matrix);
        RotateImage r = new RotateImage();
        r.printMatrix(matrix);
    }

    private static void setZeros(int[][] matrix) {

        boolean firstRow = false,firstColumn = false;

        for(int i =0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0) firstRow = true;
                    if(j==0) firstColumn = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }

            }
        }

        for(int i = 1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
              if(matrix[i][0] == 0 || matrix[0][j] == 0){
                  matrix[i][j] =0;
              }
            }
        }

        if(firstRow){
            for(int i =0;i<matrix.length;i++){
                matrix[0][i] = 0;
            }
        }

        if(firstColumn){
            for(int j =0;j<matrix[0].length;j++){
                matrix[j][0] = 0;
            }
        }
    }
}
