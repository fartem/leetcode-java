package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock
public class BestTimeToBuyAndSellStock {

    private final int[] input;

    public BestTimeToBuyAndSellStock(int[] input) {
        this.input = input;
    }

    public int solution() {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int price : input) {
            if (price < min) {
                min = price;
            } else if (price - min > max) {
                max = price - min;
            }
        }
        return max;
    }
}
