package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word
public class NumberOfStringsThatAppearAsSubstringsInWord {

    private final String[] patterns;
    private final String word;

    public NumberOfStringsThatAppearAsSubstringsInWord(
            String[] patterns,
            String word
    ) {
        this.patterns = patterns;
        this.word = word;
    }

    public int solution() {
        int result = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                result++;
            }
        }
        return result;
    }

}
