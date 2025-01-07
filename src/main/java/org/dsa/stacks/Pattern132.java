package org.dsa.stacks;

import java.util.Stack;

public class Pattern132 {
    public static boolean find132pattern(int[] nums) {

        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int thirdElement = Integer.MIN_VALUE;
        for(int i = n-1;i>=0;i--){
            if(nums[i] < thirdElement) return true;
            while(!st.isEmpty() && st.peek() < nums[i]){
                thirdElement = st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(find132pattern(new int[]{1,2,3,4}));
    }
}
