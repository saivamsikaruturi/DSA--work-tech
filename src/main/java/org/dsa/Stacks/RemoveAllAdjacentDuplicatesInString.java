package org.dsa.Stacks;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static String removeDuplicates(String s) {
    Stack<Character> st = new Stack<>();
    st.push(s.charAt(0));
    for(int i=1;i<s.length();i++){
        if(!st.isEmpty() && s.charAt(i)==st.peek()){
            st.pop();
        }
        else{
            st.push(s.charAt(i));
        }
    }
    StringBuilder sb = new StringBuilder();
    while(!st.isEmpty()){
        sb.insert(0,st.pop());
    }
    return sb.toString();
}

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
