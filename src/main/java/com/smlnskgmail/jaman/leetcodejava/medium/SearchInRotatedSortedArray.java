package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {

    private final int[] nums;
    private final int target;

    public SearchInRotatedSortedArray(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public int solution() {
        if (nums[0] == target) {
            return 0;
        }
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            int f = nums[0];
            int curr = nums[m];
            if (curr == target) {
                return m;
            } else if (f > curr) {
                if (target < f && target > curr) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            } else {
                if (f < target && target < curr) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return -1;
    }

}
