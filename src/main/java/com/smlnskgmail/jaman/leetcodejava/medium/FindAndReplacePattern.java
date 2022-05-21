package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/find-and-replace-pattern/
public class FindAndReplacePattern {

    private final String[] words;
    private final String pattern;

    public FindAndReplacePattern(String[] words, String pattern) {
        this.words = words;
        this.pattern = pattern;
    }

    public List<String> solution() {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (areMatch(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean areMatch(String word, String pattern) {
        Map<Character, Character> values = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            values.putIfAbsent(w, p);
            if (values.get(w) != p) {
                return false;
            }
        }
        boolean[] seen = new boolean[26];
        for (char c : values.values()) {
            if (seen[c - 'a']) {
                return false;
            }
            seen[c - 'a'] = true;
        }
        return true;
    }

}
