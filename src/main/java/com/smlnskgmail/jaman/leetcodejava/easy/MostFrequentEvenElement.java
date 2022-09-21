package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/most-frequent-even-element/
public class MostFrequentEvenElement {

    private final int[] input;

    public MostFrequentEvenElement(int[] input) {
        this.input = input;
    }

    public int solution() {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : input) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                max = Math.max(max, map.get(num));
            }
        }
        if (max == 0) {
            return -1;
        }
        int result = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            if (val.getValue() == max) {
                result = Math.min(result, val.getKey());
            }
        }
        return result;
    }

}
