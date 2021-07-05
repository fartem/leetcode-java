package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum
public class MinimumValueToGetPositiveStepByStepSum {

    private final int[] input;

    public MinimumValueToGetPositiveStepByStepSum(int[] input) {
        this.input = input;
    }

    public int solution() {
        int start = input[0];
        int result = start > 0 ? 1 : -start + 1;
        int sum = result + start;
        for (int i = 1; i < input.length; i++) {
            int num = input[i];
            if (sum + num < 1) {
                int additional = -(sum + num) + 1;
                result += additional;
                sum += additional;
            }
            sum += num;
        }
        return result;
    }

}
