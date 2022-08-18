package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.*;

// https://leetcode.com/problems/reduce-array-size-to-the-half/
public class ReduceArraySizeToTheHalf {

    private final int[] input;

    public ReduceArraySizeToTheHalf(int[] input) {
        this.input = input;
    }

    public int solution() {
        int n = input.length;
        if (n < 3) {
            return 1;
        }
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : input) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : m.values()) {
            q.offer(num);
        }
        int r = 0;
        int result = 0;
        while (r < n / 2 && q.size() > 0) {
            r += q.poll();
            result++;
        }
        return result;
    }

}
