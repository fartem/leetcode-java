package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-ascending-subarray-sum
public class MaximumAscendingSubarraySum {

    private final int[] input;

    public MaximumAscendingSubarraySum(int[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int sum = input[0];
        for (int i = 1; i < input.length; i++) {
            int num = input[i];
            int prev = input[i - 1];
            if (num <= prev) {
                if (result < sum) {
                    result = sum;
                }
                sum = 0;
            }
            sum += num;
        }
        return Math.max(result, sum);
    }
}
