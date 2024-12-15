package org.dsa.arrays.slidingwindow;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumKSubStringVowels {
        int maxKSubstringVowels (String s, int k) {
            // Set of vowels for quick lookup
            Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            int maxVowels = 0, currentVowelCount = 0;

            // Two-pointer approach
            int start = 0; // Start of the window
            for (int end = 0; end < s.length(); end++) {
                // Add the character at the `end` pointer to the window
                if (vowels.contains(s.charAt(end))) {
                    currentVowelCount++;
                }

                // Check if the window size exceeds `k`
                if (end - start + 1 > k) {
                    // Remove the character at the `start` pointer from the window
                    if (vowels.contains(s.charAt(start))) {
                        currentVowelCount--;
                    }
                    start++; // Slide the window
                }

                // Update the maximum vowels count
                if (end - start + 1 == k) {
                    maxVowels = Math.max(maxVowels, currentVowelCount);
                }
            }

            return maxVowels;
        }
}
