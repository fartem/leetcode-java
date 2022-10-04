package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-score-after-splitting-a-string/
public class MaximumScoreAfterSplittingAString {

    private final String input;

    public MaximumScoreAfterSplittingAString(String input) {
        this.input = input;
    }

    public int solution() {
        int max = Integer.MIN_VALUE;
        int zeros = 0;
        int ones = 0;
        int l = input.length();
        for (int i = 0; i < l; i++) {
            char c = input.charAt(i);
            if (c == '0') {
                zeros++;
            } else {
                ones++;
            }
            if (i != l - 1) {
                max = Math.max(max, zeros - ones);
            }
        }
        return max + ones;
    }

}
