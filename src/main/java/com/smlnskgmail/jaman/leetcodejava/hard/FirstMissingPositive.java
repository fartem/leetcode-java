package com.smlnskgmail.jaman.leetcodejava.hard;

import java.util.Arrays;

// https://leetcode.com/problems/first-missing-positive
public class FirstMissingPositive {

    private final int[] nums;

    public FirstMissingPositive(int[] input) {
        this.nums = input;
    }

    public int solution() {
        Arrays.sort(nums);
        int result = 1;
        for (int num : nums) {
            if (result == num) {
                result++;
            }
        }
        return result;
    }

}
