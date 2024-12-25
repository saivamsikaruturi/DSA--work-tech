package org.dsa.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{89,62,70,58,47,47,46,76,100,70})));
    }
    public static int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> st = new Stack<>();
        int[] result = new int[temperatures.length];

        for(int i = temperatures.length-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                result[i] = st.peek()-i;
            }

            st.push(i);


        }
        return result;
    }
}
