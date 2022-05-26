package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/largest-triangle-area/
public class LargestTriangleArea {

    private final int[][] input;

    public LargestTriangleArea(int[][] input) {
        this.input = input;
    }

    public double solution() {
        double result = 0;
        int n = input.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = j; k < n; k++) {
                    result = Math.max(
                            result,
                            triangle(
                                    input[i][0],
                                    input[i][1],
                                    input[j][0],
                                    input[j][1],
                                    input[k][0],
                                    input[k][1]
                            )
                    );
                }
            }
        }
        return result;
    }

    private double triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        return 0.5 * Math.abs(x1 * y2 + x2 * y3 + x3 * y1 - x1 * y3 - x2 * y1 - x3 * y2);
    }

}
