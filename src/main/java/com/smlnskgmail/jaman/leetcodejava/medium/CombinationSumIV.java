package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/combination-sum-iv/
public class CombinationSumIV {

    private final int[] nums;
    private final int target;

    public CombinationSumIV(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public int solution() {
        int[] memo = new int[target + 1];
        Arrays.fill(memo, -1);
        return find(nums, target, memo);
    }

    private int find(int[] nums, int target, int[] memo) {
        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return 0;
        }
        if (memo[target] == -1) {
            memo[target] = 0;
            for (int num : nums) {
                memo[target] += find(nums, target - num, memo);
            }
        }
        return memo[target];
    }

}
