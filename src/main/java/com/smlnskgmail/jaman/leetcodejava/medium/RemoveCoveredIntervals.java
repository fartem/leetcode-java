package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/remove-covered-intervals
public class RemoveCoveredIntervals {

    private final int[][] intervals;

    public RemoveCoveredIntervals(int[][] input) {
        this.intervals = input;
    }

    public int solution() {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int count = 0;
        int curr = 0;
        for (int[] interval : intervals) {
            if (curr < interval[1]) {
                curr = interval[1];
                count++;
            }
        }
        return count;
    }

}
