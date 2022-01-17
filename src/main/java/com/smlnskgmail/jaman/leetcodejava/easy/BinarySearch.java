package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/binary-search
public class BinarySearch {

    private final int[] nums;
    private final int target;

    public BinarySearch(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public int solution() {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int num = nums[middle];
            if (num == target) {
                return middle;
            } else if (num < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
