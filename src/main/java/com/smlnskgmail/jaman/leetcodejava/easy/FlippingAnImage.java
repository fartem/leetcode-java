package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/flipping-an-image/
public class FlippingAnImage {

    private final int[][] input;

    public FlippingAnImage(int[][] input) {
        this.input = input;
    }

    public int[][] solution() {
        int c = input[0].length;
        for (int[] row : input) {
            for (int i = 0; i < (c + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                int index = c - i - 1;
                row[i] = row[index] ^ 1;
                row[index] = temp;
            }
        }
        return input;
    }

}
