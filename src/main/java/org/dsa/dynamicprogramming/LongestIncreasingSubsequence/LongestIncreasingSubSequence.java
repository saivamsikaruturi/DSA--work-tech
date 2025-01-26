package org.dsa.dynamicprogramming.LongestIncreasingSubsequence;

public class LongestIncreasingSubSequence {
    int getLengthOfLIS(int[] A) {

        int[] m = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            m[i] = 1;
        }
        for(int i=1;i<A.length;i++){
            for(int j =0;j<i;j++ ){
                if(A[i]>A[j]){
                    m[i] = Math.max(m[j]+1,m[i]);
                }
            }
        }

        int max = 0;
        for(int i =0;i<m.length;i++){
            if(m[i]>max){
                max=m[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        LongestIncreasingSubSequence lis = new LongestIncreasingSubSequence();

        // Test case 1
        int[] array1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Length of LIS for array1: " + lis.getLengthOfLIS(array1)); // Expected: 4

        // Test case 2
        int[] array2 = {0, 1, 0, 3, 2, 3};
        System.out.println("Length of LIS for array2: " + lis.getLengthOfLIS(array2)); // Expected: 4

        // Test case 3
        int[] array3 = {7, 7, 7, 7, 7, 7};
        System.out.println("Length of LIS for array3: " + lis.getLengthOfLIS(array3)); // Expected: 1

        // Test case 4
        int[] array4 = {1, 3, 6, 7, 9, 4, 10, 5, 6};
        System.out.println("Length of LIS for array4: " + lis.getLengthOfLIS(array4)); // Expected: 6
    }

}
