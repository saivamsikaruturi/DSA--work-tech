package org.dsa.arrays.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubArraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        if(k==0){
            boolean zero = false;
            for(int i = 1;i<nums.length;i++){
                if(nums[i]==0 && nums[i-1]==0){
                    zero = true;
                }
            }
            return zero;
        }


        map.put(0,-1);
        int prefixSum = 0;
        for(int i =0;i<nums.length;i++){
            prefixSum+=nums[i];
            if(map.containsKey(prefixSum%k)){
                if(i-(map.get(prefixSum%k))>1){
                    return true;
                }
            }

            map.putIfAbsent(prefixSum%k,i);
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[]{23,2,4,6,7},6));
    }
}
