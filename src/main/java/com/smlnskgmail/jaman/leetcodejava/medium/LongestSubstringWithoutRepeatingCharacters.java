package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/longest-substring-without-repeating-characters
public class LongestSubstringWithoutRepeatingCharacters {

    private final String input;

    public LongestSubstringWithoutRepeatingCharacters(String input) {
        this.input = input;
    }

    public int solution() {
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        int index = 0;
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            index = Math.max(index, lastIndex[c] + 1);
            result = Math.max(result, i - index + 1);
            lastIndex[c] = i;
        }
        return result;
    }

}
