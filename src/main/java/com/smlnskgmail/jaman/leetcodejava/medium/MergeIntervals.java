package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

// https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {

    private final int[][] intervals;

    public MergeIntervals(int[][] input) {
        this.intervals = input;
    }

    public int[][] solution() {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        LinkedList<int[]> newIntervals = new LinkedList<>();
        for (int[] interval : intervals) {
            int[] last = newIntervals.isEmpty() ? null : newIntervals.getLast();
            if (last != null && last[1] >= interval[0]) {
                last[1] = Math.max(interval[1], last[1]);
            } else {
                newIntervals.add(interval);
            }
        }
        return newIntervals.toArray(new int[newIntervals.size()][]);
    }

}
