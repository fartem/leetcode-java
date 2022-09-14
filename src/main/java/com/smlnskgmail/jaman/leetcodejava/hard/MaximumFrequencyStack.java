package com.smlnskgmail.jaman.leetcodejava.hard;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// https://leetcode.com/problems/maximum-frequency-stack/
public class MaximumFrequencyStack {

    private final Map<Integer, Integer> freq = new HashMap<>();
    private final Map<Integer, Stack<Integer>> group = new HashMap<>();
    private int maxFreq = 0;

    public void push(int val) {
        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val, f);
        if (f > maxFreq) {
            maxFreq = f;
        }
        group.computeIfAbsent(f, z -> new Stack<>()).push(val);
    }

    public int pop() {
        int x = group.get(maxFreq).pop();
        freq.put(x, freq.get(x) - 1);
        if (group.get(maxFreq).size() == 0) {
            maxFreq--;
        }
        return x;
    }

}
