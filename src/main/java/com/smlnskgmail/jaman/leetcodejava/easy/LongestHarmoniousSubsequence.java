package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-harmonious-subsequence
public class LongestHarmoniousSubsequence {

    private final int[] input;

    public LongestHarmoniousSubsequence(int[] input) {
        this.input = input;
    }

    public int solution() {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : input) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (int num : count.keySet()) {
            if (count.containsKey(num + 1)) {
                result = Math.max(
                        result,
                        count.get(num) + count.get(num + 1)
                );
            }
        }
        return result;
    }

}
