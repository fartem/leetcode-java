package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/convert-1d-array-into-2d-array/
public class Convert1DArrayInto2DArray {

    private final int[] original;
    private final int m;
    private final int n;

    public Convert1DArrayInto2DArray(int[] original, int m, int n) {
        this.original = original;
        this.m = m;
        this.n = n;
    }

    public int[][] solution() {
        int length = original.length;
        if (length != m * n) {
            return new int[][]{};
        }
        int[][] result = new int[m][n];
        int p = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[p++];
            }
        }
        return result;
    }

}
