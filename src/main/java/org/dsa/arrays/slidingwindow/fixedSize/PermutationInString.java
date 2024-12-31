package org.dsa.arrays.slidingwindow.fixedSize;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkPermutation("ab","eidbaooo"));
    }

    private static boolean checkPermutation(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> s1Map = new HashMap<>();


        for(char c : s1.toCharArray()){
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        int windowSize = s1.length();
        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            char currentChar = s2.charAt(right);
            windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);

            if (right - left + 1 > windowSize) {
                char leftChar = s2.charAt(left);
                if (windowMap.get(leftChar) == 1) {
                    windowMap.remove(leftChar);
                } else {
                    windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                }
                left++;
            }

            if (windowMap.equals(s1Map)) {
                return true;
            }
        }

        return false;

    }
}
