package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/non-overlapping-intervals/
public class NonOverlappingIntervals {

    private final int[][] input;

    public NonOverlappingIntervals(int[][] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(input, Comparator.comparingInt(a -> a[0]));
        int max = input[0][1];
        int result = 0;
        for (int[] inter : input) {
            if (inter[0] < max) {
                result++;
                max = Math.min(max, inter[1]);
            } else {
                max = inter[1];
            }
        }
        return result - 1;
    }

}
