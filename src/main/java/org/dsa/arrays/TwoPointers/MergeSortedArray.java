package org.dsa.arrays.TwoPointers;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i] >= nums2[j]){
                    nums1[k--] = nums1[i--];
            }

            else{
                nums1[k--] = nums2[j--];
            }
        }

        while(i>=0){
            nums1[k--] = nums1[i--];
        }

        while(j>=0){
            nums1[k--] = nums2[j--];

        }


    }


public static void main(String[] args) {
    int[] nums1 = new int[]{1,2,3,0,0,0};
   merge(nums1, 3,new int[]{2,5,6}, 3);
    System.out.println(Arrays.toString(nums1));

}
}
