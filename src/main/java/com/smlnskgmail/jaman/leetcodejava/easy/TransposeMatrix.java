package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/transpose-matrix/
public class TransposeMatrix {

    private final int[][] input;

    public TransposeMatrix(int[][] input) {
        this.input = input;
    }

    public int[][] solution() {
        int r = input.length;
        int c = input[0].length;
        int[][] result = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[j][i] = input[i][j];
            }
        }
        return result;
    }

}
