package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/
public class MostFrequentNumberFollowingKeyInAnArray {

    private final int[] nums;
    private final int key;

    public MostFrequentNumberFollowingKeyInAnArray(int[] nums, int key) {
        this.nums = nums;
        this.key = key;
    }

    public int solution() {
        Map<Integer, Integer> candidates = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int num = nums[i + 1];
                int count = candidates.getOrDefault(num, 0) + 1;
                candidates.put(num, count);
                max = Math.max(max, count);
            }
        }
        for (Map.Entry<Integer, Integer> candidate : candidates.entrySet()) {
            if (candidate.getValue() == max) {
                return candidate.getKey();
            }
        }
        return -1;
    }

}
