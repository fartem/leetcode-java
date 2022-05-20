package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-prefixes-of-a-given-string/
public class CountPrefixesOfAGivenString {

    private final String[] words;
    private final String s;

    public CountPrefixesOfAGivenString(String[] words, String s) {
        this.words = words;
        this.s = s;
    }

    public int solution() {
        int result = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                result++;
            }
        }
        return result;
    }

}
