package org.dsa.stacks;

import java.util.Stack;

public class RemoveMiddleElementFromStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        remove(stack,stack.size());
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    private static void remove(Stack<Integer> stack, int size) {
        removeElement(stack,size,0);
    }

    private static void removeElement(Stack<Integer> stack, int size, int start) {

              if (start  == stack.size() / 2) {
                  stack.pop();
                  return;
              }

              int current = stack.pop();
              removeElement(stack, size, start + 1);
              stack.push(current);
          }


}
