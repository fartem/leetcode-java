package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/partition-labels/
public class PartitionLabels {

    private final String input;

    public PartitionLabels(String input) {
        this.input = input;
    }

    public List<Integer> solution() {
        int[] last = new int[26];
        for (int i = 0; i < input.length(); i++) {
            last[input.charAt(i) - 'a'] = i;
        }
        int j = 0;
        int anchor = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            j = Math.max(j, last[input.charAt(i) - 'a']);
            if (i == j) {
                result.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return result;
    }

}
