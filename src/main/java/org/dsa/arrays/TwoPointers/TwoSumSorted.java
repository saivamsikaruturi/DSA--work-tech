package org.dsa.arrays.TwoPointers;

class TwoSumSorted {
    boolean hasTwoSumZero (int[] A) {
        int left = 0;                // Initialize the left pointer to the beginning of the array.
        int right = A.length - 1;    // Initialize the right pointer to the end of the array.

        while (left < right) {
            int sum = A[left] + A[right];

            if (sum == 0) {
                return true; // Found a pair with a sum of zero
            } else if (sum < 0) {
                left++;      // Move the left pointer to the right (increasing the sum)
            } else {
                right--;     // Move the right pointer to the left (decreasing the sum)
            }
        }

        return false;
    }
}