package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/length-of-last-word
public class LengthOfLastWord {

    private final String input;

    public LengthOfLastWord(String input) {
        this.input = input;
    }

    public int solution() {
        String string = input.trim();
        int lastSpace = string.lastIndexOf(' ');
        String word = string.substring(lastSpace + 1);
        return word.length();
    }

}
