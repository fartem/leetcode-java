package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/count-number-of-nice-subarrays/
public class CountNumberOfNiceSubarrays {

    private final int[] nums;
    private final int k;

    public CountNumberOfNiceSubarrays(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int solution() {
        int[] prefix = new int[nums.length + 1];
        int max = 0;
        int count = 0;
        for (int num : nums) {
            prefix[count]++;
            if (num % 2 != 0) {
                count++;
            }
            if (count >= k) {
                max += prefix[count - k];
            }
        }
        return max;
    }

}
