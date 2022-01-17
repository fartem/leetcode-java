package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away
public class CheckIfAll1AreAtLeastLengthKPlacesAway {

    private final int[] nums;
    private final int k;

    public CheckIfAll1AreAtLeastLengthKPlacesAway(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public boolean solution() {
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (last == -1) {
                    last = i;
                    continue;
                }
                if (i - last < k + 1) {
                    return false;
                } else {
                    last = i;
                }
            }
        }
        return true;
    }
}
