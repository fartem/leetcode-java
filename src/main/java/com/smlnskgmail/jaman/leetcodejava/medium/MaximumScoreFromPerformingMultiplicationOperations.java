package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/
public class MaximumScoreFromPerformingMultiplicationOperations {

    private final int[] nums;
    private final int[] multipliers;

    public MaximumScoreFromPerformingMultiplicationOperations(int[] nums, int[] multipliers) {
        this.nums = nums;
        this.multipliers = multipliers;
    }

    public int solution() {
        int m = multipliers.length;
        int[][] dp = new int[m + 1][m + 1];
        int n = nums.length;
        for (int op = m - 1; op >= 0; op--) {
            for (int l = op; l >= 0; l--) {
                dp[op][l] = Math.max(
                        multipliers[op] * nums[l] + dp[op + 1][l + 1],
                        multipliers[op] * nums[n - 1 - (op - l)] + dp[op + 1][l]
                );
            }
        }
        return dp[0][0];
    }

}
