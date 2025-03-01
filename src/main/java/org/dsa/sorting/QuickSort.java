package org.dsa.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class QuickSort {
    public static void main(String[] args) {
        int[] arrays = {4,9,2,5,7,1,6,8,3};
        sortByQuickSort(arrays, 0, arrays.length - 1);

        System.out.println("Sorted array: " + Arrays.stream(arrays).boxed().collect(Collectors.toList()));
    }

    private static void sortByQuickSort(int[] arrays, int start, int end) {
        if (start < end) {
            int partition = findPartition(arrays, start, end);
            System.out.println("part"+partition);
            sortByQuickSort(arrays, start, partition - 1);
            sortByQuickSort(arrays, partition + 1, end);
        }
    }

    private static int findPartition(int[] arrays, int start, int end) {
        int pivot = arrays[start];
        int i = start;
        for(int j = start+1; j<=end;j++){
            if(arrays[j]<pivot){
                i++;
                swap(arrays,i,j);
            }
        }
        swap(arrays,i,start);
        return i;
    }
    static void  swap(int[] array , int start,int end){
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
}
