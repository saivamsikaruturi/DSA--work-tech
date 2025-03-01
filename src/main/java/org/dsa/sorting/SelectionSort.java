package org.dsa.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrays = {13, 46, 24, 52, 20, 9};
        int[] sort = sort(arrays);
        System.out.println(Arrays.stream(sort).boxed().collect(Collectors.toList()));
    }

    /* Selects the minimum and swap*/
    /* The Time complexity is near about 0(n^2)*/
    public static int[] sort(int[] array){
       for(int i=0;i<array.length;i++){
           for(int j=i;j<array.length;j++){
               int min =i;
               if(array[j]<array[i]){
                   min =j;
               }
               swap(array, i, min);
           }
       }
       return array;
}

    private static void swap(int[] array, int i, int min) {
        int temp = array[i];
        array[i]= array[min];
        array[min]=temp;
    }
}
