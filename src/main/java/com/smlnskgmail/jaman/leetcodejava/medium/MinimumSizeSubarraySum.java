package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/minimum-size-subarray-sum
public class MinimumSizeSubarraySum {

    private final int target;
    private final int[] nums;

    public MinimumSizeSubarraySum(int target, int[] nums) {
        this.target = target;
        this.nums = nums;
    }

    public int solution() {
        int result = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i - l);
                sum -= nums[l++];
            }
        }
        return result != Integer.MAX_VALUE ? result + 1 : 0;
    }
}
