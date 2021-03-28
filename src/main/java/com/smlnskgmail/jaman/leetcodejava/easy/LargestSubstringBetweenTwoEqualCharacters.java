package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/largest-substring-between-two-equal-characters
public class LargestSubstringBetweenTwoEqualCharacters {

    private final String input;

    public LargestSubstringBetweenTwoEqualCharacters(String input) {
        this.input = input;
    }

    public int solution() {
        int max = -1;
        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (chars.containsKey(c)) {
                int candidate = i - chars.get(c) - 1;
                if (candidate > max) {
                    max = candidate;
                }
            } else {
                chars.put(c, i);
            }
        }
        return max;
    }

}
