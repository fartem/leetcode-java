package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
public class MaximizeSumOfArrayAfterKNegations {

    private final int[] nums;
    private int k;

    public MaximizeSumOfArrayAfterKNegations(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int solution() {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && k != 0; i++) {
            int num = nums[i];
            if (num < 0) {
                nums[i] = -num;
                k--;
            }
        }
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int num : nums) {
            result += num;
            min = Math.min(min, num);
        }
        return result - (k % 2) * min * 2;
    }

}
