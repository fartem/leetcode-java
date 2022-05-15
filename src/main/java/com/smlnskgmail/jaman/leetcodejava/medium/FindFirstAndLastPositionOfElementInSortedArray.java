package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
public class FindFirstAndLastPositionOfElementInSortedArray {

    private final int[] nums;
    private final int target;

    public FindFirstAndLastPositionOfElementInSortedArray(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public int[] solution() {
        int h = nums.length - 1;
        int s = findStart(nums, target, 0, h);
        if (s == -1) {
            return new int[]{-1, -1};
        }
        int e = findEnd(nums, target, 0, h);
        return new int[]{s, e};
    }

    private int findStart(int[] nums, int target, int l, int h) {
        if (h >= l) {
            int m = l + (h - l) / 2;
            int num = nums[m];
            if ((m == 0 || target > nums[m - 1]) && num == target) {
                return m;
            }
            return target > num ? findStart(nums, target, m + 1, h) : findStart(nums, target, l, m - 1);
        }
        return -1;
    }

    private int findEnd(int[] nums, int target, int l, int h) {
        if (h >= l) {
            int m = l + (h - l) / 2;
            int num = nums[m];
            if ((m == nums.length - 1 || target < nums[m + 1]) && num == target) {
                return m;
            }
            return target < num ? findEnd(nums, target, l, m - 1) : findEnd(nums, target, m + 1, h);
        }
        return -1;
    }

}
