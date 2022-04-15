package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array
public class SumOfAbsoluteDifferencesInASortedArray {

    private final int[] nums;

    public SumOfAbsoluteDifferencesInASortedArray(int[] input) {
        this.nums = input;
    }

    public int[] solution() {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        int[] result = new int[n];
        result[0] = nums[n - 1] - n * nums[0];
        for (int i = 1; i < n; i++) {
            int left = nums[i - 1];
            int right = nums[n - 1] - nums[i];
            int current = nums[i] - left;
            result[i] = i * current - left + right - (n - i - 1) * current;
        }
        return result;
    }

}
