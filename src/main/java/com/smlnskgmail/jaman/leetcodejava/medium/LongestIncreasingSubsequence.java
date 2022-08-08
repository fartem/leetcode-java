package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/longest-increasing-subsequence/
public class LongestIncreasingSubsequence {

    private final List<Integer> incr = new ArrayList<>();
    private final int[] input;

    public LongestIncreasingSubsequence(int[] input) {
        this.input = input;
    }

    public int solution() {
        incr.add(input[0]);
        for (int i = 1; i < input.length; i++) {
            int num = input[i];
            if (num > incr.get(incr.size() - 1)) {
                incr.add(num);
            } else {
                incr.set(binarySearch(num), num);
            }
        }
        return incr.size();
    }

    private int binarySearch(int num) {
        int l = 0;
        int r = incr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (incr.get(m) == num) {
                return m;
            }
            if (incr.get(m) < num) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

}
