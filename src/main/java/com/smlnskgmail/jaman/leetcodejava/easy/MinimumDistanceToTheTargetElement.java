package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-distance-to-the-target-element/
public class MinimumDistanceToTheTargetElement {

    private final int[] nums;
    private final int target;
    private final int start;

    public MinimumDistanceToTheTargetElement(int[] input, int target, int start) {
        this.nums = input;
        this.target = target;
        this.start = start;
    }

    public int solution() {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == target) {
                int abs = Math.abs(i - start);
                if (abs < result) {
                    result = abs;
                }
            }
        }
        return result;
    }

}
