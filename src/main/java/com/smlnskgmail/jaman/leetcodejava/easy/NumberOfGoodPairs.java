package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/number-of-good-pairs
public class NumberOfGoodPairs {

    private final int[] input;

    public NumberOfGoodPairs(int[] input) {
        this.input = input;
    }

    public int solution() {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : input) {
            count.put(num, count.get(num) == null ? 1 : count.get(num) + 1);
        }
        int pairs = 0;
        for (int val : count.values()) {
            pairs += val * (val - 1) / 2;
        }
        return pairs;
    }

}
