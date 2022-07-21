package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/subarray-sum-equals-k/
public class SubarraySumEqualsK {

    private final int[] nums;
    private final int k;

    public SubarraySumEqualsK(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int solution() {
        int result = 0;
        int pre = 0;
        Map<Integer, Integer> values = new HashMap<>();
        values.put(0, 1);
        for (int num : nums) {
            pre += num;
            result += values.getOrDefault(pre - k, 0);
            values.put(pre, values.getOrDefault(pre, 0) + 1);
        }
        return result;
    }

}
