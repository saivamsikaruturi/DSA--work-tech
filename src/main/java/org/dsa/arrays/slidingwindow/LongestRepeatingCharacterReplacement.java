package org.dsa.arrays.slidingwindow;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        System.out.println(longestRepeatingCharacterString("AABABCC",2));
    }

    private static int longestRepeatingCharacterString(String s,int k) {
        int[] freq = new int[26];
        int left = 0;
        int right = 0;
        int maxWindow = 0;
        int maxFreq = 0;

        while(right < s.length()){

            freq[s.charAt(right)-'A']++;

            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);

            int windowLength = right - left +1;

            if(windowLength - maxFreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowLength = right-left+1;
            maxWindow = Math.max(maxWindow,windowLength);
            right++;
        }
        return maxWindow;
    }
}
