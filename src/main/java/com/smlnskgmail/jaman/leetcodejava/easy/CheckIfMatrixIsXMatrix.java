package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-matrix-is-x-matrix/
public class CheckIfMatrixIsXMatrix {

    private final int[][] input;

    public CheckIfMatrixIsXMatrix(int[][] input) {
        this.input = input;
    }

    public boolean solution() {
        int n = input.length;
        for (int i = 0; i < n; i++) {
            if (input[i][i] == 0 || input[i][n - i - 1] == 0) {
                return false;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && j != n - i - 1) {
                    if (input[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
