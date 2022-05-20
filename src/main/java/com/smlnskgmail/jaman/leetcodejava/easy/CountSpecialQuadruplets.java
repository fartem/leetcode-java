package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-special-quadruplets/
public class CountSpecialQuadruplets {

    private final int[] nums;

    public CountSpecialQuadruplets(int[] input) {
        this.nums = input;
    }

    public int solution() {
        int[] values = new int[101];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int index = nums[k] - nums[j] - nums[i];
                    if (index >= 0) {
                        result += values[index];
                    }
                }
            }
            values[c]++;
        }
        return result;
    }

}
