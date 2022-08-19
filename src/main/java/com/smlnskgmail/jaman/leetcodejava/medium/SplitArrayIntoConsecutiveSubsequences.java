package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/split-array-into-consecutive-subsequences/
public class SplitArrayIntoConsecutiveSubsequences {

    private final int[] input;

    public SplitArrayIntoConsecutiveSubsequences(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        if (input.length < 3) {
            return false;
        }
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : input) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        Queue<Integer> q = new PriorityQueue<>(m.keySet());
        while (!q.isEmpty()) {
            int min = q.peek();
            int count = 0;
            while (true) {
                if (!m.containsKey(min)) {
                    if (count < 3) {
                        return false;
                    }
                    break;
                }
                m.put(min, m.get(min) - 1);
                count++;
                if (m.get(min) == 0) {
                    if (min != q.peek()) {
                        return false;
                    }
                    q.poll();
                }
                if (m.containsKey(min + 1) && m.get(min) + 1 > m.get(min + 1)) {
                    if (count < 3) {
                        return false;
                    }
                    break;
                }
                min += 1;
            }
        }
        return true;
    }

}
