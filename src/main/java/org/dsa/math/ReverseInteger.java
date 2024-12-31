package org.dsa.math;

public class ReverseInteger {

    public static int reverse(int x) {
        int temp = x;
        int result = 0;
        while (temp!=0){
            int rem = temp%10;
            if( (result>Integer.MAX_VALUE/10)   || (result<Integer.MIN_VALUE/10)   )
            {
                return 0;
            }
            result = result*10+rem;
            temp = temp/10;
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
