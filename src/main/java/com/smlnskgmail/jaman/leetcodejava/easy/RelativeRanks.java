package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/relative-ranks
public class RelativeRanks {

    private final int[] input;

    public RelativeRanks(int[] input) {
        this.input = input;
    }

    public String[] solution() {
        int[] copy = Arrays.copyOf(input, input.length);
        Arrays.sort(copy);
        Map<Integer, Integer> positions = new HashMap<>();
        for (int i = 0; i < copy.length; i++) {
            positions.put(copy[i], copy.length - i);
        }
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            int value = positions.get(input[i]);
            switch (value) {
                case 1:
                    result[i] = "Gold Medal";
                    break;
                case 2:
                    result[i] = "Silver Medal";
                    break;
                case 3:
                    result[i] = "Bronze Medal";
                    break;
                default:
                    result[i] = String.valueOf(value);
                    break;

            }
        }
        return result;
    }

}
