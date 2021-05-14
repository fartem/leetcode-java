package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/word-pattern
public class WordPattern {

    private final String pattern;
    private final String string;

    public WordPattern(
            String pattern,
            String string
    ) {
        this.pattern = pattern;
        this.string = string;
    }

    public boolean solution() {
        String[] words = string.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Character, String> matches = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String word = words[i];
            if (matches.containsKey(p)) {
                String value = matches.get(p);
                if (!value.equals(word)) {
                    return false;
                }
            } else if (matches.containsValue(word)) {
                return false;
            }
            matches.put(p, word);
        }
        return true;
    }

}
