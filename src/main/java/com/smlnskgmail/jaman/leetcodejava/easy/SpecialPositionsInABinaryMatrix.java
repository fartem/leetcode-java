package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/special-positions-in-a-binary-matrix/
public class SpecialPositionsInABinaryMatrix {

    private final int[][] input;

    public SpecialPositionsInABinaryMatrix(int[][] input) {
        this.input = input;
    }

    public int solution() {
        int[] sumRow = new int[input.length];
        int[] sumColumn = new int[input[0].length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                int sum = input[i][j];
                sumRow[i] += sum;
                sumColumn[j] += sum;
            }
        }
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (input[i][j] == 1 && sumRow[i] == 1 && sumColumn[j] == 1) {
                    result++;
                }
            }
        }
        return result;
    }

}
