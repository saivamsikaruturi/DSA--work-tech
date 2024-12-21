package org.dsa.arrays.TwoPointers;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {

        int start = 0;
        int end = 0 ;
        while(start<=nums.length-1){
            if(nums[start]!=0){
                swap(nums,start,end);
                start++;
                end++;
            }
            else{
                start++;
            }
        }

    }

    static void swap(int[] nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};
       moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }
}
