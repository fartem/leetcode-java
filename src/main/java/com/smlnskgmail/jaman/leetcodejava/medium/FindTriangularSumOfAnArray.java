package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/find-triangular-sum-of-an-array
public class FindTriangularSumOfAnArray {

    private final int[] nums;

    public FindTriangularSumOfAnArray(int[] input) {
        this.nums = input;
    }

    public int solution() {
        int count = nums.length;
        while (count != 1) {
            for (int i = 0; i < count - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            count--;
        }
        return nums[0];
    }

}
