package org.dsa.arrays.matrix;

public class SearchInAMatrix {

        public static  boolean checkValueInMatrix(int[][] matrix, int target){

            int m = matrix[0][0];
            int n = matrix[matrix.length-1][matrix[0].length-1];

            if (target == m || target == n) {
                return true;
            }

            if(target < m || target > n){
                return false;
            }

             int rowNum =  searchPotentialRow(matrix,target);
            if(rowNum == -1)
            {
                return false;
            }
             return binarySearch(matrix,rowNum,target);

          }

    private static boolean binarySearch(int[][] matrix,int row,int target) {
            int low = 0;
            int high = matrix[0].length-1;
            while(low <=high){
              int mid = low+(high-low)/2;
              if(matrix[row][mid] == target)
                  return true;
              else if(matrix[row][mid] > target)
                  high = mid-1;
              else
                  low = mid+1;
            }
            return false;

    }


    static  int searchPotentialRow(int[][] matrix, int target){
        int low = 0;
        int high = matrix.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the target is within the range of the current row
            if (matrix[mid][0]  <= target && target <= matrix[mid][matrix[mid].length - 1]) {
                return mid;
            }

            if (matrix[mid][0] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }



    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(checkValueInMatrix(matrix,5));
        int[][] matrix = new int[][]{{1},{3}};
        System.out.println(checkValueInMatrix(matrix,2));
    }
}
