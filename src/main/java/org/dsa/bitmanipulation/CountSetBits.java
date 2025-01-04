package org.dsa.bitmanipulation;

public class CountSetBits {
    //Brian Kernighan’s Algorithm
    static int getCountOfSetBits(int n) {
        int count =0;
        while(n> 0){
            n = (n&n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCountOfSetBits(11));
    }
}
