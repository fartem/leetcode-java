package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/search-a-2d-matrix-ii/
public class SearchA2DMatrixII {

    private final int[][] matrix;
    private final int target;

    public SearchA2DMatrixII(int[][] matrix, int target) {
        this.matrix = matrix;
        this.target = target;
    }

    public boolean solution() {
        for (int[] matr : matrix) {
            int l = 0;
            int r = matrix[0].length - 1;
            while (l <= r) {
                int m = (l + r) / 2;
                int curr = matr[m];
                if (curr == target) {
                    return true;
                } else if (curr > target) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return false;
    }

}
