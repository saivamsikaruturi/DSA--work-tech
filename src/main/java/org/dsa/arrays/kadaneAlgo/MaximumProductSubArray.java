package org.dsa.arrays.kadaneAlgo;

public class MaximumProductSubArray {
    public static int maxProduct(int[] nums) {

        int ans = nums[0];
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;

        for(int i =0;i<n;i++){

            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1: rightProduct;

            leftProduct *= nums[i];
            rightProduct *= nums[n-i-1];

            ans = Math.max(ans,Math.max(leftProduct,rightProduct));
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2,3,-2,4}));
    }
}
