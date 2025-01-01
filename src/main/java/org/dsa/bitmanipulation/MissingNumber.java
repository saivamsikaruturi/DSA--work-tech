package org.dsa.bitmanipulation;

public class MissingNumber {
    static int findTheMissingNumber(int[] nums) {
        // add your logic here

        int result = 0;

        for(int num : nums){
            result = result^num;
        }

        for(int i =1;i<=nums.length+1;i++){
            result = result^i;
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(findTheMissingNumber(new int[]{3, 1, 4}));
    }
}
