package org.dsa.binarySearch;

import java.util.Arrays;

public class FirstAndLastElement {
    public static int[] searchRange(int[] nums, int target) {

        int  start = leftBound(nums,target);
        int  end = rightBound(nums,target);

        return new int[]{start,end};
    }

    static int leftBound(int[] nums, int target){

        int index = -1;
        int low = 0, high = nums.length-1;

        while(low<=high){

            int mid = low +(high-low)/2;

            if(nums[mid] == target){
                index = mid;
                high = mid-1;
            }

            else if( target < nums[mid]){
                high = mid-1;
            }

            else{
                low = mid+1;
            }

        }
        return index;

    }


    static int rightBound(int[] nums, int target){

        int index = -1;
        int low = 0, high = nums.length-1;

        while(low<=high){

            int mid = low +(high-low)/2;

            if(nums[mid] == target){
                index = mid;
                low = mid+1;
            }

            else if( target < nums[mid]){
                high = mid-1;
            }

            else{
                low = mid+1;
            }

        }
        return index;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }
}
