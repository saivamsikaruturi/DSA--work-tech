package org.dsa.arrays.TwoPointers;

public class UniqueElementsInSortedArray {
    int removeDuplicates(int[] A) {
        // Check for empty or single-element array
        if (A == null || A.length == 0) {
            return 0;
        }

        // Pointer for the position of the next unique element
        int uniqueIndex = 1;

        // Traverse the array with the second pointer
        for (int i = 1; i < A.length; i++) {
            // If the current element is not equal to the previous unique element
            if (A[i] != A[i - 1]) {
                // Assign the current element to the next unique position
                A[uniqueIndex] = A[i];
                uniqueIndex++;
            }
        }

        // The number of unique elements is equal to uniqueIndex
        return uniqueIndex;
    }
}
