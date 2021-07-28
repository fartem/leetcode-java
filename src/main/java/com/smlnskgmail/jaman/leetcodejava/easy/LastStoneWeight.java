package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/last-stone-weight
public class LastStoneWeight {

    private final int[] input;

    public LastStoneWeight(int[] input) {
        this.input = input;
    }

    public int solution() {
        Queue<Integer> weights = new PriorityQueue<>(
                input.length,
                Collections.reverseOrder()
        );
        for (int stone : input) {
            weights.add(stone);
        }
        while (!weights.isEmpty()) {
            int f = weights.peek() == null ? 0 : weights.poll();
            int s = weights.peek() == null ? 0 : weights.poll();
            if (f != s) {
                int diff = Math.abs(f - s);
                weights.add(diff);
                if (weights.size() == 1) {
                    return diff;
                }
            }
        }
        return 0;
    }

}
