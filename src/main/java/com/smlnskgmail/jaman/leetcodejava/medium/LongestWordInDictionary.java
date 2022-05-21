package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-word-in-dictionary/
public class LongestWordInDictionary {

    private final String[] input;

    public LongestWordInDictionary(String[] input) {
        this.input = input;
    }

    public String solution() {
        Set<String> values = new HashSet<>();
        Collections.addAll(values, input);
        String result = "";
        for (String word : input) {
            boolean contains = true;
            for (int i = 1; i < word.length(); i++) {
                if (!values.contains(word.substring(0, i))) {
                    contains = false;
                    break;
                }
            }
            if (contains) {
                int rLength = result.length();
                int wLength = word.length();
                if (rLength < wLength || (rLength == wLength && result.compareTo(word) > 0)) {
                    result = word;
                }
            }
        }
        return result;
    }

}
