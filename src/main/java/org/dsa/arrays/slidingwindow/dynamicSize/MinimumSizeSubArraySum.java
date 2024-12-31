package org.dsa.arrays.slidingwindow.dynamicSize;

public class MinimumSizeSubArraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int i =0,j=0,len=Integer.MAX_VALUE;
        int sum = 0;
        while(j<nums.length){

            sum+=nums[j];
            while(sum >= target){
               sum -=nums[i];
                len = Math.min(j-i+1,len);
                i++;
            }
            j++;
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }
}
