package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/maximum-xor-for-each-query
public class MaximumXORForEachQuery {

    private final int[] nums;
    private final int maximumBit;

    public MaximumXORForEachQuery(int[] nums, int maximumBit) {
        this.nums = nums;
        this.maximumBit = maximumBit;
    }

    public int[] solution() {
        int[] result = new int[nums.length];
        int xor = (1 << maximumBit) - 1;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
            result[nums.length - i - 1] = xor;
        }
        return result;
    }

}
