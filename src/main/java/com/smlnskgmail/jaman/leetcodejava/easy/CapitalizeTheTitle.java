package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/capitalize-the-title/
public class CapitalizeTheTitle {

    private final String input;

    public CapitalizeTheTitle(String input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        for (String word : input.split(" ")) {
            result.append(word.toLowerCase());
            if (word.length() > 2) {
                int first = result.length() - word.length();
                result.setCharAt(first, Character.toUpperCase(result.charAt(first)));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

}
