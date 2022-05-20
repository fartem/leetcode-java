package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/counting-words-with-a-given-prefix/
public class CountingWordsWithAGivenPrefix {

    private final String[] words;
    private final String pref;

    public CountingWordsWithAGivenPrefix(String[] words, String pref) {
        this.words = words;
        this.pref = pref;
    }

    public int solution() {
        int result = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                result++;
            }
        }
        return result;
    }

}
