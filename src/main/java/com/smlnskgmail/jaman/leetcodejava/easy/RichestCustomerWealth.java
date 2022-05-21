package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {

    private final int[][] input;

    public RichestCustomerWealth(int[][] input) {
        this.input = input;
    }

    public int solution() {
        int result = Integer.MIN_VALUE;
        for (int[] account : input) {
            int amount = 0;
            for (int value : account) {
                amount += value;
            }
            if (amount > result) {
                result = amount;
            }
        }
        return result;
    }

}
