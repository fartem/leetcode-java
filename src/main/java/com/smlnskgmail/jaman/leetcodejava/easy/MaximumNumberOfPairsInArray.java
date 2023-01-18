package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/maximum-number-of-pairs-in-array/
public class MaximumNumberOfPairsInArray {

    private final int[] input;

    public MaximumNumberOfPairsInArray(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : input) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int pairs = 0;
        int leftover = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            pairs += count / 2;
            leftover += count % 2;
        }
        return new int[]{pairs, leftover};
    }

}
