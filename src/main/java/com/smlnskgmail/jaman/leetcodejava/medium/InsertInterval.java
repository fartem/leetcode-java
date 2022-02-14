package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/insert-interval
public class InsertInterval {

    private final int[][] intervals;
    private final int[] newInterval;

    public InsertInterval(int[][] intervals, int[] newInterval) {
        this.intervals = intervals;
        this.newInterval = newInterval;
    }

    public int[][] solution() {
        List<int[]> newIntervals = new ArrayList<>();
        int p = 0;
        while (p < intervals.length && intervals[p][1] < newInterval[0]) {
            newIntervals.add(intervals[p]);
            p++;
        }
        while (p < intervals.length && intervals[p][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[p][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[p][1]);
            p++;
        }
        newIntervals.add(newInterval);
        while (p < intervals.length) {
            newIntervals.add(intervals[p++]);
        }
        int[][] result = new int[newIntervals.size()][];
        for (int i = 0; i < result.length; i++) {
            result[i] = newIntervals.get(i);
        }
        return result;
    }

}
