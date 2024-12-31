package org.dsa.stacks;

import java.util.Stack;

public class RemoveDuplicateLetters {

    static String  getUniqueCharacterStringLexographically(String s){
        boolean[] freq = new boolean[26];
        int[] lastIndex = new int[26];

        for(int i =0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a'] = i;
        }
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){

            if(freq[s.charAt(i)-'a']){
                continue;
            }
            while(!st.isEmpty() && s.charAt(i) < st.peek() && i<lastIndex[st.peek()-'a']){
                freq[st.peek()-'a'] = false;
                st.pop();
            }
            st.push(s.charAt(i));
            freq[st.peek()-'a'] = true;
        }
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }

        return sb.toString();
      }

    public static void main(String[] args) {
        System.out.println(getUniqueCharacterStringLexographically("cbacdcbc"));
    }
}
