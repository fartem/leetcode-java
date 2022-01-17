package com.smlnskgmail.jaman.leetcodejava.easy;

public class CountNumberOfPairsWithAbsoluteDifferenceK {

    private final int[] nums;
    private final int k;

    public CountNumberOfPairsWithAbsoluteDifferenceK(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    result++;
                }
            }
        }
        return result;
    }
}
