package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-subarray
public class MaximumSubarray {

    private final int[] input;

    public MaximumSubarray(int[] input) {
        this.input = input;
    }

    public int solution() {
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;
        for (int num : input) {
            localMax = Math.max(num, num + localMax);
            if (globalMax < localMax) {
                globalMax = localMax;
            }
        }
        return globalMax;
    }
}
