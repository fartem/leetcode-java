package com.smlnskgmail.jaman.leetcodejava.hard;

// https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/
public class MaxSumOfRectangleNoLargerThanK {

    private final int[][] matrix;
    private final int k;

    public MaxSumOfRectangleNoLargerThanK(int[][] matrix, int k) {
        this.matrix = matrix;
        this.k = k;
    }

    public int solution() {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int a = i + 1; a <= m; a++) {
                    for (int b = j + 1; b <= n; b++) {
                        int temp = dp[a][b] - dp[a][j] - dp[i][b] + dp[i][j];
                        if (temp <= k) {
                            if (temp == k) {
                                return k;
                            }
                            result = Math.max(result, temp);
                        }
                    }
                }
            }
        }
        return result;
    }

}
