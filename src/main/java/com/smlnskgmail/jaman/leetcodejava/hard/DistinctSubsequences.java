package com.smlnskgmail.jaman.leetcodejava.hard;

// https://leetcode.com/problems/distinct-subsequences/
public class DistinctSubsequences {

    private final String s;
    private final String t;

    public DistinctSubsequences(String s, String t) {
        this.s = s;
        this.t = t;
    }

    public int solution() {
        int m = s.length();
        int n = t.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = n; j >= 1; j--) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[j] = dp[j - 1] + dp[j];
                }
            }
        }
        return dp[n];
    }

}
