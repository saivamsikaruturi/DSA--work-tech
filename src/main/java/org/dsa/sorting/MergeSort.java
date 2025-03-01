package org.dsa.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arrays = {13, 46, 24, 52, 20, 9};
        sortByMergeSort(arrays, arrays.length);
        System.out.println(Arrays.toString(arrays));
    }

    /* Divide and merge */
    /* The Time Complexity is O(nlogn) and Space Complexity - O(N) */
    private static void sortByMergeSort(int[] arrays, int size) {
        if (size < 2) {
            return;
        }

        int mid = size / 2;

        int[] leftArray = Arrays.copyOfRange(arrays, 0, mid);
        int[] rightArray = Arrays.copyOfRange(arrays, mid, size);

        sortByMergeSort(leftArray, mid);
        sortByMergeSort(rightArray, size - mid);

        // Merge the sorted left and right arrays directly into the original array
        merge(arrays, leftArray, rightArray);
    }

    private static void merge(int[] arrays, int[] leftArray, int[] rightArray) {
        int left = 0;
        int right = 0;
        int index = 0;

        while (left < leftArray.length && right < rightArray.length) {
            if (leftArray[left] <= rightArray[right]) {
                arrays[index++] = leftArray[left++];
            } else {
                arrays[index++] = rightArray[right++];
            }
        }

        // Copy any remaining elements from the left subarray
        while (left < leftArray.length) {
            arrays[index++] = leftArray[left++];
        }

        // Copy any remaining elements from the right subarray
        while (right < rightArray.length) {
            arrays[index++] = rightArray[right++];
        }
    }
}
