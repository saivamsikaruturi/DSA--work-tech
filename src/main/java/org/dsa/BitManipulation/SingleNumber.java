package org.dsa.BitManipulation;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,2,2,1,1,}));
    }
}
