package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/smallest-range-ii/
public class SmallestRangeII {

    private final int[] nums;
    private final int k;

    public SmallestRangeII(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int solution() {
        int length = nums.length;
        Arrays.sort(nums);
        int result = nums[length - 1] - nums[0];
        for (int i = 0; i < length - 1; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            int h = Math.max(nums[length - 1] - k, a + k);
            int l = Math.min(nums[0] + k, b - k);
            result = Math.min(result, h - l);
        }
        return result;
    }

}
