package org.dsa.Math;

public class PalindromeNumber {
    static boolean isPalindrome(int x){
        int temp = x;
        int result = 0;
        while (temp>0){
             int rem = temp%10;
             result = result*10+rem;
             temp = temp/10;
        }

        if(result == x)
         return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
