package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/percentage-of-letter-in-string/
public class PercentageOfLetterInString {

    private final String s;
    private final char letter;

    public PercentageOfLetterInString(String s, char letter) {
        this.s = s;
        this.letter = letter;
    }

    public int solution() {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }
        return (int) ((double) count / s.length() * 100);
    }

}
