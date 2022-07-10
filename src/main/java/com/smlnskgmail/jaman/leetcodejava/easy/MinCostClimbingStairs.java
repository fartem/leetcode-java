package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/min-cost-climbing-stairs/
public class MinCostClimbingStairs {

    private final int[] input;

    public MinCostClimbingStairs(int[] input) {
        this.input = input;
    }

    public int solution() {
        int n = input.length;
        if (n == 2) {
            return Math.min(input[0], input[1]);
        }
        int[] dp = new int[n + 1];
        int dpN = dp.length;
        for (int i = 2; i < dpN; i++) {
            dp[i] = Math.min(
                    dp[i - 1] + input[i - 1],
                    dp[i - 2] + input[i - 2]
            );
        }
        return dp[dpN - 1];
    }

}
