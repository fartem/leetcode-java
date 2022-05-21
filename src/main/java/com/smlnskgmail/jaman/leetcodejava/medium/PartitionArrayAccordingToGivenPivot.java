package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/partition-array-according-to-given-pivot/
public class PartitionArrayAccordingToGivenPivot {

    private final int[] nums;
    private final int pivot;

    public PartitionArrayAccordingToGivenPivot(int[] nums, int pivot) {
        this.nums = nums;
        this.pivot = pivot;
    }

    public int[] solution() {
        int[] result = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        int i = 0;
        while (l < r && i < nums.length) {
            if (nums[i] < pivot) {
                result[l++] = nums[i];
            }
            if (nums[nums.length - i - 1] > pivot) {
                result[r--] = nums[nums.length - i - 1];
            }
            i++;
        }
        for (; l <= r; l++) {
            result[l] = pivot;
        }
        return result;
    }

}
