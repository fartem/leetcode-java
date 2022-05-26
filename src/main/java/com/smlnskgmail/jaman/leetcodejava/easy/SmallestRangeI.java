package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/smallest-range-i/
public class SmallestRangeI {

    private final int[] nums;
    private final int k;

    public SmallestRangeI(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int solution() {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        int abs = Math.abs(k);
        return max - abs < min + abs ? 0 : max - min - 2 * abs;
    }

}
