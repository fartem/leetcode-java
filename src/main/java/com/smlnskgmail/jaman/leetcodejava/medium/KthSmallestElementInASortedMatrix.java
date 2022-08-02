package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
public class KthSmallestElementInASortedMatrix {

    private final int[][] matrix;
    private final int k;

    public KthSmallestElementInASortedMatrix(int[][] matrix, int k) {
        this.matrix = matrix;
        this.k = k;
    }

    public int solution() {
        int n = matrix.length;
        int l = matrix[0][0];
        int h = matrix[n - 1][n - 1];
        int m;
        int temp;
        int count;
        while (l < h) {
            m = l + (h - l) / 2;
            temp = n - 1;
            count = 0;
            for (int[] mat : matrix) {
                while (temp >= 0 && mat[temp] > m) {
                    temp--;
                }
                count += (temp + 1);
            }
            if (count < k) {
                l = m + 1;
            } else {
                h = m;
            }
        }
        return l;
    }

}
