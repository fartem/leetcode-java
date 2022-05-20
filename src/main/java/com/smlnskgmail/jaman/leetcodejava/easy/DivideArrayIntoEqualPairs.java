package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/divide-array-into-equal-pairs/
public class DivideArrayIntoEqualPairs {

    private final int[] nums;

    public DivideArrayIntoEqualPairs(int[] input) {
        this.nums = input;
    }

    public boolean solution() {
        int[] counts = new int[501];
        for (int num : nums) {
            counts[num]++;
        }
        for (int count : counts) {
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }

}
