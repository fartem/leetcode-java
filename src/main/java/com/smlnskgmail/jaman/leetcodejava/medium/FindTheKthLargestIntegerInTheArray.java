package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/
public class FindTheKthLargestIntegerInTheArray {

    private final String[] nums;
    private final int k;

    public FindTheKthLargestIntegerInTheArray(String[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public String solution() {
        Arrays.sort(nums, (o1, o2) -> {
            int diff = Integer.compare(o1.length(), o2.length());
            if (diff == 0) {
                return o1.compareTo(o2);
            }
            return diff;
        });
        return nums[nums.length - k];
    }

}
