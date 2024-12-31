package org.dsa.hashing.Set;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        int maxLength = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int longestLength = 1;
            if (!set.contains(num - 1)) {
                while (set.contains(num + 1)) {
                    num++;
                    longestLength++;
                }
            }
            maxLength = Math.max(longestLength, maxLength);
        }

        return maxLength;

    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

}
