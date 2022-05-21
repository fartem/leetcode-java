package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/positions-of-large-groups/
public class PositionsOfLargeGroups {

    private final String input;

    public PositionsOfLargeGroups(String input) {
        this.input = input;
    }

    public List<List<Integer>> solution() {
        List<List<Integer>> result = new ArrayList<>();
        char prev = input.charAt(0);
        int count = 1;
        int length = input.length();
        for (int i = 1; i < length; i++) {
            char c = input.charAt(i);
            if (c == prev) {
                count++;
            } else {
                if (count >= 3) {
                    result.add(Arrays.asList(i - count, i - 1));
                }
                count = 1;
                prev = c;
            }
        }
        if (count >= 3) {
            result.add(Arrays.asList(length - count, length - 1));
        }
        return result;
    }

}
