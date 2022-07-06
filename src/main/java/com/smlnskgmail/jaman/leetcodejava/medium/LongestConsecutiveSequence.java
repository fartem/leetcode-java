package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {

    private final int[] input;

    public LongestConsecutiveSequence(int[] input) {
        this.input = input;
    }

    public int solution() {
        Set<Integer> uniq = new HashSet<>();
        for (int num : input) {
            uniq.add(num);
        }
        int result = 0;
        for (int num : input) {
            if (!uniq.contains(num - 1)) {
                int curr = num;
                int count = 1;
                while (uniq.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                result = Math.max(result, count);
            }
        }
        return result;
    }

}
