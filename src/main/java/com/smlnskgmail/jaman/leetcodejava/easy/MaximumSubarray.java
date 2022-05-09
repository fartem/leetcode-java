package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-subarray
public class MaximumSubarray {

    private final int[] input;

    public MaximumSubarray(int[] input) {
        this.input = input;
    }

    public int solution() {
        int max = input[0];
        int curr = max;
        for (int i = 1; i < input.length; i++) {
            int num = input[i];
            curr = Math.max(curr + num, num);
            max = Math.max(curr, max);
        }
        return max;
    }

}
