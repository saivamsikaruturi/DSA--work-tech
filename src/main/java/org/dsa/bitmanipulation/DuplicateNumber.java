package org.dsa.bitmanipulation;

public class DuplicateNumber {
    int findTheDuplicateNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;

        // XOR all the array elements
        for (int num : nums) {
            xor ^= num;
        }

        // XOR all numbers from 1 to n-1
        for (int i = 1; i < n; i++) {
            xor ^= i;
        }
        return xor;
    }

    public static void main(String[] args) {
        DuplicateNumber dn = new DuplicateNumber();
        int[] nums = {3, 1, 3, 4, 2}; // Example input with duplicate 3
        System.out.println("Duplicate number: " + dn.findTheDuplicateNumber(nums)); // Expected output: 3
    }
}
