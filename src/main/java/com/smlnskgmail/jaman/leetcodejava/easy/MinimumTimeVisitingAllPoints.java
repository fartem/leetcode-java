package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-time-visiting-all-points
public class MinimumTimeVisitingAllPoints {

    private final int[][] input;

    public MinimumTimeVisitingAllPoints(int[][] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (int i = 1; i < input.length; i++) {
            int[] curr = input[i - 1];
            int[] next = input[i];
            result += Math.max(
                    Math.abs(curr[0] - next[0]),
                    Math.abs(curr[1] - next[1])
            );
        }
        return result;
    }

}
