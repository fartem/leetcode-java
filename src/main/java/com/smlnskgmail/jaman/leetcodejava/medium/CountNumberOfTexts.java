package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/count-number-of-texts/
public class CountNumberOfTexts {

    private final String input;

    public CountNumberOfTexts(String input) {
        this.input = input;
    }

    public int solution() {
        int mod = (int) Math.pow(10, 9) + 7;
        int n = input.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            char c = input.charAt(i - 1);
            dp[i] = (dp[i] % mod + dp[i - 1] % mod) % mod;
            if (i - 2 >= 0 && input.charAt(i - 2) == c) {
                dp[i] = (dp[i] % mod + dp[i - 2] % mod) % mod;
                if (i - 3 >= 0 && input.charAt(i - 3) == c) {
                    dp[i] = (dp[i] % mod + dp[i - 3] % mod) % mod;
                    if ((i - 4 >= 0 && input.charAt(i - 4) == c)
                            && (c == '7' || c == '9')) {
                        dp[i] = (dp[i] % mod + dp[i - 4] % mod) % mod;
                    }
                }
            }
        }
        return dp[n];
    }

}
