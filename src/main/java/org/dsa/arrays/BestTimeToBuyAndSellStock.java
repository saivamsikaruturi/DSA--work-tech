package org.dsa.arrays;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++){
            minSoFar = Math.min(minSoFar,prices[i]);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(maxProfit,profit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
