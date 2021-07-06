package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square
public class NumberOfRectanglesThatCanFormTheLargestSquare {

    private final int[][] input;

    public NumberOfRectanglesThatCanFormTheLargestSquare(int[][] input) {
        this.input = input;
    }

    public int solution() {
        int max = 0;
        for (int[] rectangle : input) {
            int min = Math.min(rectangle[0], rectangle[1]);
            rectangle[0] = min;
            rectangle[1] = min;
            if (min > max) {
                max = min;
            }
        }
        int result = 0;
        for (int[] rectangle : input) {
            if (rectangle[0] == max) {
                result++;
            }
        }
        return result;
    }

}
