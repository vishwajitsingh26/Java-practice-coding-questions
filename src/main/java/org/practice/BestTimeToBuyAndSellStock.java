package org.practice;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0; // Cannot make a profit with less than 2 days of prices
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if a lower price is encountered
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Update the maximum profit if a better selling day is found
            else {
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        return maxProfit;
    }
}
