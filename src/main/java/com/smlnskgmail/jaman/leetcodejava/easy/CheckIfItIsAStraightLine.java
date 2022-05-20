package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-it-is-a-straight-line/
public class CheckIfItIsAStraightLine {

    private final int[][] input;

    public CheckIfItIsAStraightLine(int[][] input) {
        this.input = input;
    }

    public boolean solution() {
        double[] slope = new double[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            int[] point1 = input[i - 1];
            int[] point2 = input[i];
            slope[i - 1] = point1[0] == point2[0]
                    ? Integer.MAX_VALUE
                    : ((double) (point1[1] - point2[1])) / ((double) (point1[0] - point2[0]));
        }
        for (int i = 1; i < input.length - 1; i++) {
            if (Math.abs(slope[i] - slope[i - 1]) > 1e-6) {
                return false;
            }
        }
        return true;
    }

}
