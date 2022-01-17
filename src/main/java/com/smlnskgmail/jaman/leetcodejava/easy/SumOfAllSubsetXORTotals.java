package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/sum-of-all-subset-xor-totals
public class SumOfAllSubsetXORTotals {

    private final int[] input;

    public SumOfAllSubsetXORTotals(int[] input) {
        this.input = input;
    }

    public int solution() {
        int bits = 0;
        for (int num : input) {
            bits |= num;
        }
        return bits * (int) Math.pow(2, input.length - 1);
    }
}
