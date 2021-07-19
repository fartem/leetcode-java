package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays
public class MakeTwoArraysEqualByReversingSubArrays {

    private final int[] target;
    private final int[] arr;

    public MakeTwoArraysEqualByReversingSubArrays(
            int[] target,
            int[] arr
    ) {
        this.target = target;
        this.arr = arr;
    }

    public boolean solution() {
        int[] nums = new int[1001];
        for (int num : target) {
            nums[num] = nums[num] + 1;
        }
        for (int num : arr) {
            if (nums[num] == 0) {
                return false;
            } else {
                nums[num] = nums[num] - 1;
            }
        }
        return true;
    }

}
