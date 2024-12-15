package org.dsa.arrays.TwoPointers;

public class DutchNationalFlag {
    void sortTheArray(int[] A) {

        int low = 0;
        int high = A.length - 1;
        int i = 0;

        while (i <= high) {
            if (A[i] == 0) {
                swap(A, low, i);
                i++;
                low++;
            } else if (A[i] == 1) {
                i++;
            } else {
                swap(A, high, i);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int low, int i) {
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
}
