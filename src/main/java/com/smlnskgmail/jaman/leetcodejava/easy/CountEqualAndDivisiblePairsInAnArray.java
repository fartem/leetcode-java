package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array
public class CountEqualAndDivisiblePairsInAnArray {

    private final int[] nums;
    private final int k;

    public CountEqualAndDivisiblePairsInAnArray(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int f = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int s = nums[j];
                if (f == s && (i * j) % k == 0) {
                    result++;
                }
            }
        }
        return result;
    }

}
