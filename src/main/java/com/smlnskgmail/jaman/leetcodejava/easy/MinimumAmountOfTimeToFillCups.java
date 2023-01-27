package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/
public class MinimumAmountOfTimeToFillCups {

    private final int[] input;

    public MinimumAmountOfTimeToFillCups(int[] input) {
        this.input = input;
    }

    public int solution() {
        int max = 0;
        int sum = 0;
        for (int num : input) {
            max = Math.max(max, num);
            sum += num;
        }
        return Math.max(max, (sum + 1) / 2);
    }

}
