package org.dsa.stacks;

import java.util.Stack;

public class OnlineStockSpan {
    private Stack<int[]> st;

    public OnlineStockSpan() {
        st = new Stack<>();
    }

    public int next(int price) {
        int span =1;

        while(!st.isEmpty() && st.peek()[0] <= price)
            span += st.pop()[1];


        st.add(new int[]{price,span});
        return span;
    }

    public static void main(String[] args) {
        // Input
        String[] operations = {"StockSpanner", "next", "next", "next", "next", "next", "next", "next"};
        int[][] arguments = {{}, {100}, {80}, {60}, {70}, {60}, {75}, {85}};

        // Initialize the StockSpanner object
        OnlineStockSpan stockSpanner = null;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("StockSpanner")) {
                stockSpanner = new OnlineStockSpan();
                System.out.print("null, ");
            } else if (operations[i].equals("next")) {
                int result = stockSpanner.next(arguments[i][0]);
                System.out.print(result + (i < operations.length - 1 ? ", " : ""));
            }
        }
    }

}
