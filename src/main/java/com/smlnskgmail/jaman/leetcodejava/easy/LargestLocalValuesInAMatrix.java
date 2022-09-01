package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/largest-local-values-in-a-matrix/
public class LargestLocalValuesInAMatrix {

    private final int[][] input;

    public LargestLocalValuesInAMatrix(int[][] input) {
        this.input = input;
    }

    public int[][] solution() {
        int n = input.length;
        int[][] result = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                result[i][j] = highest(input, i, j);
            }
        }
        return result;
    }

    private int highest(int[][] grid, int r, int c) {
        int max = 0;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }

}
