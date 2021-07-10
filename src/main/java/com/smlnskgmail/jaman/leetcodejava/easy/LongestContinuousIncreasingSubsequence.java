package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/longest-continuous-increasing-subsequence
public class LongestContinuousIncreasingSubsequence {

    private final int[] input;

    public LongestContinuousIncreasingSubsequence(int[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int max = 1;
        for (int i = 1; i < input.length; i++) {
            if (input[i - 1] < input[i]) {
                max++;
            } else {
                if (max > result) {
                    result = max;
                }
                max = 1;
            }
        }
        return Math.max(result, max);
    }

}
