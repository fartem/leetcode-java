package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/rotate-array
public class RotateArray {

    private final int[] nums;
    private final int k;

    public RotateArray(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public void solution() {
        if (nums.length < 2 || k == 0) {
            return;
        }
        int div = k > nums.length ? k % nums.length : k;
        if (div == 0) {
            return;
        }
        int[] copy = new int[nums.length];
        int part = nums.length - div;
        System.arraycopy(nums, 0, copy, 0, nums.length);
        System.arraycopy(copy, 0, nums, div, part);
        System.arraycopy(copy, part, nums, 0, div);
    }

}
