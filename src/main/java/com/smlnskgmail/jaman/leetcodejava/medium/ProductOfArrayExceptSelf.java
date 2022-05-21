package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelf {

    private final int[] nums;

    public ProductOfArrayExceptSelf(int[] input) {
        this.nums = input;
    }

    public int[] solution() {
        int mul = 1;
        int zeros = 0;
        for (int num : nums) {
            zeros += num == 0 ? 1 : 0;
            mul *= num == 0 ? 1 : num;
        }
        if (zeros > 1) {
            return new int[nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            nums[i] = zeros == 0 ? nums[i] = mul / num : num == 0 ? mul : 0;
        }
        return nums;
    }

}
