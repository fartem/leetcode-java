package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/get-maximum-in-generated-array/
public class GetMaximumInGeneratedArray {

    private final int input;

    public GetMaximumInGeneratedArray(int input) {
        this.input = input;
    }

    public int solution() {
        if (input < 2) {
            return input;
        }
        int[] nums = new int[input + 1];
        nums[0] = 0;
        nums[1] = 1;
        int result = 0;
        for (int i = 2; i < input + 1; i++) {
            if (i % 2 == 0) {
                nums[i] = nums[i / 2];
            } else {
                nums[i] = nums[i / 2] + nums[i / 2 + 1];
            }
            result = Math.max(result, nums[i]);
        }
        return result;
    }

}
