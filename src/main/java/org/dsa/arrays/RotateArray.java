package org.dsa.arrays;

import java.util.Arrays;

public class RotateArray {

      static void  getRotatedArray(int[] array,int k){
          k = k%array.length;
            reverse(array);

            reverseElements(array,0,k-1);

            reverseElements(array,k,array.length-1);

      }

    private static void reverseElements(int[] array, int start, int end) {
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    private static void reverse(int[] array) {
          int start = 0;
          int end = array.length-1;
          while(start<end){
              int temp = array[start];
              array[start] = array[end];
              array[end] = temp;
              start++;
              end--;
          }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        getRotatedArray(array,3);
        System.out.println(Arrays.toString(array));
    }
}
