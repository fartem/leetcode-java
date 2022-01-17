package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-average-subarray-i
public class MaximumAverageSubarrayI {

    private final int[] nums;
    private final int k;

    public MaximumAverageSubarrayI(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public double solution() {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int result = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            result = Math.max(result, sum);
        }
        return result * 1.0 / k;
    }
}
