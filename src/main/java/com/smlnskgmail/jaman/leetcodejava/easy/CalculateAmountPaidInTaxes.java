package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/calculate-amount-paid-in-taxes/
public class CalculateAmountPaidInTaxes {

    private final int[][] brackets;
    private final int income;

    public CalculateAmountPaidInTaxes(int[][] brackets, int income) {
        this.brackets = brackets;
        this.income = income;
    }

    public double solution() {
        double result = 0;
        int prev = 0;
        for (int[] bracket : brackets) {
            int upper = bracket[0];
            int percent = bracket[1];
            if (income >= upper) {
                result += (upper - prev) * percent / 100d;
                prev = upper;
            } else {
                return result + ((income - prev) * percent / 100d);
            }
        }
        return result;
    }

}
