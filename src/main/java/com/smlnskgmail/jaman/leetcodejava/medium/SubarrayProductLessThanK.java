package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/subarray-product-less-than-k/
public class SubarrayProductLessThanK {

    private final int[] nums;
    private final int k;

    public SubarrayProductLessThanK(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int solution() {
        if (k <= 1) {
            return 0;
        }
        int result = 0;
        int prod = 1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) {
                prod /= nums[left++];
            }
            result += right - left + 1;
        }
        return result;
    }

}
