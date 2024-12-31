package org.dsa.Hashing.HashMap;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        for(int num : nums){
            count[num]++;
        }

        int totalCount =0;
        for(int i : count){
            totalCount+=(i*(i-1))/2;
        }
        return totalCount;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,1,1,4}));
    }
}
