package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/calculate-money-in-leetcode-bank//
public class CalculateMoneyInLeetcodeBank {

    private final int input;

    public CalculateMoneyInLeetcodeBank(int input) {
        this.input = input;
    }

    public int solution() {
        int weeks = input / 7;
        int result = 0;
        for (int i = 1; i <= weeks; i++) {
            result += 7 * (i + 3);
        }
        for (int i = 7 * weeks; i < input; i++) {
            result += ++weeks;
        }
        return result;
    }

}
