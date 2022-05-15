package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock
public class BestTimeToBuyAndSellStock {

    private final int[] input;

    public BestTimeToBuyAndSellStock(int[] input) {
        this.input = input;
    }

    public int solution() {
        int max = 0;
        int min = input[0];
        for (int i = 1; i < input.length; i++) {
            int price = input[i];
            max = Math.max(price - min, max);
            min = Math.min(price, min);
        }
        return max;
    }

}
