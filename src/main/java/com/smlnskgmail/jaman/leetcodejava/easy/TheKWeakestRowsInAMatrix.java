package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
public class TheKWeakestRowsInAMatrix {

    private final int[][] mat;
    private final int k;

    public TheKWeakestRowsInAMatrix(int[][] mat, int k) {
        this.mat = mat;
        this.k = k;
    }

    public int[] solution() {
        int[][] values = new int[100][100];
        for (int i = 0; i < mat.length; i++) {
            int solders = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    break;
                } else {
                    solders++;
                }
            }
            values[solders][i] = 1;
        }
        int[] result = new int[k];
        int p = 0;
        for (int[] value : values) {
            for (int i = 0; i < value.length; i++) {
                if (value[i] == 1 && p != k) {
                    result[p++] = i;
                }
            }
            if (p == k) {
                break;
            }
        }
        return result;
    }

}
