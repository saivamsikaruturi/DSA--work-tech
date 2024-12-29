package org.dsa.Stacks;

import java.util.Stack;

public class BasicCalculatorII {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        s = s.trim();

        for(int i =0;i<s.length();i++){

            char currentChar = s.charAt(i);

            if(Character.isDigit(currentChar)){
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }

            if(!Character.isDigit(currentChar) && currentChar!=' ' || i== s.length()-1){
                switch (operation){
                    case '+' :
                        stack.push(currentNumber);
                        break;
                    case '-' :
                        stack.push(-currentNumber);
                       break;
                    case '*' :
                        stack.push(currentNumber*stack.pop());
                          break;
                    case '/' :
                        stack.push(stack.pop()/currentNumber);
                        break;
                }

                currentNumber = 0;
                operation = currentChar;
            }

        }

        int result = 0;
        while(!stack.isEmpty()){
            result+=stack.pop();
        }

        return  result;

    }

    public static void main(String[] args) {
        System.out.println(calculate("77+22*3"));
    }
}