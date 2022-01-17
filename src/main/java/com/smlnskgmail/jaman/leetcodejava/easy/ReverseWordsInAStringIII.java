package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/reverse-words-in-a-string-iii
public class ReverseWordsInAStringIII {

    private final String input;

    public ReverseWordsInAStringIII(String input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        for (String word : input.split(" ")) {
            result.append(" ").append(new StringBuilder(word).reverse());
        }
        return result.toString().trim();
    }
}
