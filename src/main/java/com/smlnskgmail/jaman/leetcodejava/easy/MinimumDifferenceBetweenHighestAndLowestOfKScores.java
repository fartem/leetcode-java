package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores
public class MinimumDifferenceBetweenHighestAndLowestOfKScores {

    private final int[] nums;
    private final int k;

    public MinimumDifferenceBetweenHighestAndLowestOfKScores(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int solution() {
        if (k == 1) {
            return 0;
        }
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for (int i = k - 1; i < nums.length; i++) {
            result = Math.min(result, nums[i] - nums[i - k + 1]);
        }
        return result;
    }
}
