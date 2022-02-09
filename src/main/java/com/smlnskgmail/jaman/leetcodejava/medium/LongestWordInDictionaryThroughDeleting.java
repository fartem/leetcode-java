package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.List;

// https://leetcode.com/problems/longest-word-in-dictionary-through-deleting
public class LongestWordInDictionaryThroughDeleting {

    private final String s;
    private final List<String> dictionary;

    public LongestWordInDictionaryThroughDeleting(String s, List<String> dictionary) {
        this.s = s;
        this.dictionary = dictionary;
    }

    public String solution() {
        String result = "";
        for (String word : dictionary) {
            if (isValid(s, word)) {
                int rL = result.length();
                int wL = word.length();
                if (rL == wL && result.compareTo(word) > 0 || wL > rL) {
                    result = word;
                }
            }
        }
        return result;
    }

    private boolean isValid(String s, String word) {
        int sP = 0;
        int wP = 0;
        while (sP < s.length() && wP < word.length()) {
            wP += s.charAt(sP) == word.charAt(wP) ? 1 : 0;
            sP++;
        }
        return wP == word.length();
    }

}
