package org.dsa.bitmanipulation;

public class PowerOfTwo {
    boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwo powerCheck = new PowerOfTwo();

        // Test cases
        int[] testCases = {1, 2, 4, 8, 16, 31, 32, 63, 64, 127, 128, 1024, 2048, 4096, 8192, -8, 0};

        for (int num : testCases) {
            System.out.println(num + " is power of two? " + powerCheck.isPowerOfTwo(num));
        }
    }
}
