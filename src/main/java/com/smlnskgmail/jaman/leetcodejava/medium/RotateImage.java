package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/rotate-image
public class RotateImage {

    private final int[][] matrix;

    public RotateImage(int[][] input) {
        this.matrix = input;
    }

    public void solution() {
        int length = matrix.length;
        for (int i = 0; i < (length + 1) / 2; i++) {
            for (int j = 0; j < length / 2; j++) {
                int fIndex = length - j - 1;
                int temp = matrix[fIndex][i];
                int sIndex = length - i - 1;
                matrix[fIndex][i] = matrix[sIndex][fIndex];
                matrix[sIndex][fIndex] = matrix[j][sIndex];
                matrix[j][sIndex] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

}
