package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/search-a-2d-matrix/
public class SearchA2DMatrix {

    private final int[][] matrix;
    private final int target;

    public SearchA2DMatrix(int[][] matrix, int target) {
        this.matrix = matrix;
        this.target = target;
    }

    public boolean solution() {
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            int curr = matrix[i][j];
            if (curr == target) {
                return true;
            } else if (curr > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

}
