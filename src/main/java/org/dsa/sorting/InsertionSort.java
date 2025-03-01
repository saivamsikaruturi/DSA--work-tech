package org.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 7, 4, 11, 13};
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr, int size) {
        int i, j;

        // iterating from 2nd element to the last
        for (i = 1; i < size; i++) {
            if (arr[i] < arr[i - 1]) {
                j = i;
                while (j > 0 && arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                    j--;
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
