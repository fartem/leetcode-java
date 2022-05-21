package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagonalSum {

    private final int[][] input;

    public MatrixDiagonalSum(int[][] input) {
        this.input = input;
    }

    public int solution() {
        int start = 0;
        int end = input[0].length - 1;
        int result = 0;
        for (int i = 0; i < input.length / 2; i++) {
            result += input[i][start];
            result += input[i][end];
            result += input[input.length - i - 1][start];
            result += input[input.length - i - 1][end];
            start++;
            end--;
        }
        if (start == end) {
            result += input[input.length / 2][start];
        }
        return result;
    }

}
