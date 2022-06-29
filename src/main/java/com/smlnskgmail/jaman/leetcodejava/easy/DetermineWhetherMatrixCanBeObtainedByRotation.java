package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
public class DetermineWhetherMatrixCanBeObtainedByRotation {

    private final int[][] mat;
    private final int[][] target;

    public DetermineWhetherMatrixCanBeObtainedByRotation(int[][] mat, int[][] target) {
        this.mat = mat;
        this.target = target;
    }

    public boolean solution() {
        int length = mat.length;
        boolean fC = true;
        boolean sC = true;
        boolean tC = true;
        boolean lC = true;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int curr = mat[i][j];
                if (fC && curr != target[i][j]) {
                    fC = false;
                }
                if (sC && curr != target[j][length - i - 1]) {
                    sC = false;
                }
                if (tC && curr != target[length - i - 1][length - j - 1]) {
                    tC = false;
                }
                if (lC && curr != target[length - j - 1][i]) {
                    lC = false;
                }
            }
        }
        return fC || sC || tC || lC;
    }

}
