package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/replace-all-digits-with-characters
public class ReplaceAllDigitsWithCharacters {

    private final String input;

    public ReplaceAllDigitsWithCharacters(String input) {
        this.input = input;
    }

    public String solution() {
        char[] chars = input.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {
            int prev = chars[i - 1];
            int curr = Character.getNumericValue(chars[i]);
            chars[i] = (char) (prev + curr);
        }
        return String.valueOf(chars);
    }
}
