package org.dsa.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
       int prefixProduct = 1;
       int suffixProduct = 1;
       int[] result = new int[nums.length];
       for(int i=0;i<nums.length;i++){
           result[i] = prefixProduct;
           prefixProduct*=nums[i];
       }

        for(int j= nums.length-1;j>=0;j--){
            result[j] *= suffixProduct;
            suffixProduct*=nums[j];
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }


}
