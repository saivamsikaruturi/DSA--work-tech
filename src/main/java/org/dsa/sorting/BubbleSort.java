package org.dsa.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrays = {13, 46, 24, 52, 20, 9};
        int[] sortedArray = bubbleSort(arrays);

        // Print the sorted array
        System.out.println(Arrays.stream(sortedArray).boxed().collect(Collectors.toList()));
    }

    /**
     * Bubble Sort Algorithm
     * - Pushes the maximum element to the last via adjacent swaps.
     * - Best case time complexity: O(N) (when the array is already sorted).
     * - Worst/Average case time complexity: O(N^2).
     */
    public static int[] bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {  // Iterate over the entire array
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {  // Compare adjacent elements
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred, array is already sorted
            if (!swapped) break;
        }

        return array;
    }
}
