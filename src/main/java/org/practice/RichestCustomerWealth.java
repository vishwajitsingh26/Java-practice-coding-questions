package org.practice;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {

    public static void main(String[] args) {

    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int i : account) {
                wealth = wealth + i;
            }
            if (wealth > maxWealth)
                maxWealth = wealth;

        }
        return maxWealth;

    }
}
