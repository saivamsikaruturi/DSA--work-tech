package org.dsa.arrays.slidingwindow;

public class KSubArraySum {

    public int[] getKSubarraySum(int[] A, int k) {
        int n = A.length;
        int[] result = new int[n - k + 1];
        int sum = 0;

        // Calculate the initial sum for the first window
        int i = 0;
        while (i < k) {
            sum += A[i];
            i++;
        }

        // Store the first window sum
        result[0] = sum;

        // Use a sliding window to calculate the sum of each subarray
        int start = 1; // Start from the second subarray
        while (start <= n - k) {
            // Subtract the element that goes out of the window
            sum -= A[start - 1];
            // Add the new element that comes into the window
            sum += A[start + k - 1];
            result[start] = sum;
            start++;
        }

        return result;
    }
}
