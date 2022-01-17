package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/sorting-the-sentence
public class SortingTheSentence {

    private final String input;

    public SortingTheSentence(String input) {
        this.input = input;
    }

    public String solution() {
        String[] words = input.split(" ");
        Arrays.sort(
                words,
                (s1, s2) ->
                        Character.compare(s1.charAt(s1.length() - 1), s2.charAt(s2.length() - 1)));
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word, 0, word.length() - 1).append(" ");
        }
        return result.toString().trim();
    }
}
