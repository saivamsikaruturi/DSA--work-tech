package org.dsa.stacks;

import java.util.Stack;

public class RemoveStarsFromString {
    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){

            if(!st.isEmpty() && s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.insert(0,st.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
}
