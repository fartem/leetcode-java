package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/ones-and-zeroes/
public class OnesAndZeroes {

    private final String[] strs;
    private final int m;
    private final int n;

    public OnesAndZeroes(String[] strs, int m, int n) {
        this.strs = strs;
        this.m = m;
        this.n = n;
    }

    public int solution() {
        int[][] result = new int[m + 1][n + 1];
        for (String s : strs) {
            int zeros = 0;
            int ones = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }
            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    result[i][j] = Math.max(result[i][j], result[i - zeros][j - ones] + 1);
                }
            }
        }
        return result[m][n];
    }

}
