package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

// https://leetcode.com/problems/random-pick-index
public class RandomPickIndex {

    private final HashMap<Integer, List<Integer>> indices = new HashMap<>();
    private final Random random = new Random();
    private final int[] input;

    public RandomPickIndex(int[] input) {
        this.input = input;
    }

    public int solution(int target) {
        if (indices.isEmpty()) {
            for (int i = 0; i < input.length; i++) {
                int num = input[i];
                if (indices.containsKey(num)) {
                    indices.get(num).add(i);
                } else {
                    List<Integer> values = new ArrayList<>();
                    values.add(i);
                    indices.put(
                            num,
                            values
                    );
                }
            }
        }
        List<Integer> picks = indices.get(target);
        return picks.get(random.nextInt(picks.size()));
    }

}
