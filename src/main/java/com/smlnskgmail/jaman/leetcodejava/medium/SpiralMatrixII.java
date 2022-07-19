package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/spiral-matrix-ii/
public class SpiralMatrixII {

    private final int input;

    public SpiralMatrixII(int input) {
        this.input = input;
    }

    public int[][] solution() {
        int[][] result = new int[input][input];
        int c = 1;
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int d = 0;
        int row = 0;
        int col = 0;
        while (c <= input * input) {
            result[row][col] = c++;
            int rowP = Math.floorMod(row + dir[d][0], input);
            int colP = Math.floorMod(col + dir[d][1], input);
            if (result[rowP][colP] != 0) {
                d = (d + 1) % 4;
            }
            row += dir[d][0];
            col += dir[d][1];
        }
        return result;
    }

}
