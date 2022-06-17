package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/reshape-the-matrix/
public class ReshapeTheMatrix {

    private final int[][] mat;
    private final int r;
    private final int c;

    public ReshapeTheMatrix(int[][] mat, int r, int c) {
        this.mat = mat;
        this.r = r;
        this.c = c;
    }

    public int[][] solution() {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int k = 0;
        int l = 0;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (l == mat[0].length) {
                    l = 0;
                    k++;
                }
                result[i][j] = mat[k][l];
                l++;
            }
        }
        return result;
    }

}
