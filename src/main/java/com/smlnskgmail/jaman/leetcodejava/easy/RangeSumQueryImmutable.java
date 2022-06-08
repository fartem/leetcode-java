package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/range-sum-query-immutable/
public class RangeSumQueryImmutable {

    private final int[] input;

    public RangeSumQueryImmutable(int[] nums) {
        input = new int[nums.length];
        input[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            input[i] = input[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return input[right];
        }
        return input[right] - input[left - 1];
    }

}
