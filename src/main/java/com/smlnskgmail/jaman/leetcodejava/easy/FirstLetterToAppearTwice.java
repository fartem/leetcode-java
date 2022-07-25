package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/first-letter-to-appear-twice/
public class FirstLetterToAppearTwice {

    private final String input;

    public FirstLetterToAppearTwice(String input) {
        this.input = input;
    }

    public char solution() {
        char[] letters = new char[128];
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (letters[curr] == 1) {
                return curr;
            }
            letters[curr]++;
        }
        return '0';
    }

}
