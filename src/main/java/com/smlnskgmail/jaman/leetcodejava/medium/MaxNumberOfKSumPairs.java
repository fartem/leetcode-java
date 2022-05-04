package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/max-number-of-k-sum-pairs
public class MaxNumberOfKSumPairs {

    private final int[] nums;
    private final int k;

    public MaxNumberOfKSumPairs(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int solution() {
        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            int s = k - num;
            int sCount = count.getOrDefault(s, 0);
            if (sCount > 0) {
                result++;
                count.put(s, sCount - 1);
            } else {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
        }
        return result;
    }

}
