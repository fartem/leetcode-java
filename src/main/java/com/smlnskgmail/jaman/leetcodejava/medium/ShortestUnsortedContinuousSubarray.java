package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
public class ShortestUnsortedContinuousSubarray {

    private final int[] input;

    public ShortestUnsortedContinuousSubarray(int[] input) {
        this.input = input;
    }

    public int solution() {
        int[] sorted = input.clone();
        Arrays.sort(sorted);
        int start = input.length;
        int end = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != sorted[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        return end - start >= 0 ? end - start + 1 : 0;
    }

}
