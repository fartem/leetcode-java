package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered
public class CheckIfAllTheIntegersInARangeAreCovered {

    private final int[][] ranges;
    private final int left;
    private final int right;

    public CheckIfAllTheIntegersInARangeAreCovered(
            int[][] ranges,
            int left,
            int right
    ) {
        this.ranges = ranges;
        this.left = left;
        this.right = right;
    }

    public boolean solution() {
        int[] nums = new int[50];
        for (int[] range : ranges) {
            for (int i = range[0] - 1; i < range[1]; i++) {
                nums[i] = 1;
            }
        }
        for (int i = left - 1; i < right; i++) {
            if (nums[i] == 0) {
                return false;
            }
        }
        return true;
    }

}
