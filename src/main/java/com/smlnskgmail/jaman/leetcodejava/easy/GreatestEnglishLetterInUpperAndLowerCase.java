package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/
public class GreatestEnglishLetterInUpperAndLowerCase {

    private final String input;

    public GreatestEnglishLetterInUpperAndLowerCase(String input) {
        this.input = input;
    }

    public String solution() {
        char[] upper = new char[128];
        char[] lower = new char[128];
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (Character.isUpperCase(curr)) {
                upper[curr]++;
            } else {
                lower[curr]++;
            }
        }
        for (char c = 'Z'; c >= 'A'; c--) {
            if (upper[c] > 0 && lower[Character.toLowerCase(c)] > 0) {
                return String.valueOf(c);
            }
        }
        return "";
    }

}
