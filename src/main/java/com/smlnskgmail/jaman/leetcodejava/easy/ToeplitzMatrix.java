package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/toeplitz-matrix
public class ToeplitzMatrix {

    private final int[][] input;

    public ToeplitzMatrix(int[][] input) {
        this.input = input;
    }

    public boolean solution() {
        for (int i = 1; i < input.length; i++) {
            for (int j = 1; j < input[0].length; j++) {
                if (input[i - 1][j - 1] != input[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
