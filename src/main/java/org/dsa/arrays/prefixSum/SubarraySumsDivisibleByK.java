package org.dsa.arrays.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumsDivisibleByK {
    public static int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize for the case where the prefix sum itself is divisible by k

        for (int num : nums) {
            sum += num;
            int remainder = (sum%k+k)%k; // Ensure positive remainder


            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }

            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(subarraysDivByK(new int[]{4,5,0,-2,-3,1},5));
    }
}
