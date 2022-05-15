package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-palindromic-subsequence
public class LongestPalindromicSubsequence {

    private final String input;

    public LongestPalindromicSubsequence(String input) {
        this.input = input;
    }

    public int solution() {
        return calculateLength(input, 0, input.length() - 1, new HashMap<>());
    }

    private int calculateLength(String s, int start, int end, Map<String, Integer> subs) {
        if (start > end) {
            return 0;
        } else if (start == end) {
            return 1;
        }
        char sChar = s.charAt(start);
        char eChar = s.charAt(end);
        String key = start + "/" + end;
        if (!subs.containsKey(key)) {
            int currLength;
            if (sChar == eChar) {
                currLength = calculateLength(s, start + 1, end - 1, subs) + 2;
            } else {
                currLength = Math.max(
                        calculateLength(s, start + 1, end, subs),
                        calculateLength(s, start, end - 1, subs)
                );
            }
            subs.put(key, currLength);
        }
        return subs.get(key);
    }

}
