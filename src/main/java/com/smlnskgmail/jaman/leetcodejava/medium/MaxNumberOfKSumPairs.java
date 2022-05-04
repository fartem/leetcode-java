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
        for (int num : nums) {
            int c = count.getOrDefault(num, 0);
            count.put(num, c + 1);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> c : count.entrySet()) {
            int val = c.getKey();
            result += Math.min(
                    c.getValue(),
                    count.getOrDefault(k - val, 0)
            );
        }
        return result / 2;
    }

}
