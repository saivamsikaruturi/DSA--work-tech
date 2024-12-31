package org.dsa.stacks;

import java.util.Stack;

public class BalancedParenthesis {
    static boolean isBalancedParentheses(String str) {
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            else if( (str.charAt(i)=='}' && !stack.isEmpty() && stack.peek()=='{') || (str.charAt(i)==']'&& !stack.isEmpty() && stack.peek()=='[') || (str.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='(')){
                stack.pop();
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isBalancedParentheses("()[]{}"));
    }
}
