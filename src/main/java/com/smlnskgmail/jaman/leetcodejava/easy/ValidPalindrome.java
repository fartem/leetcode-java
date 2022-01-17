package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/valid-palindrome
public class ValidPalindrome {

    private final String input;

    public ValidPalindrome(String input) {
        this.input = input;
    }

    public boolean solution() {
        StringBuilder onlyLetters = new StringBuilder();
        String str = input.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char candidate = str.charAt(i);
            if (Character.isLetterOrDigit(candidate)) {
                onlyLetters.append(candidate);
            }
        }
        int length = onlyLetters.length();
        if (length == 1) {
            return true;
        }
        for (int i = 0; i < length / 2; i++) {
            if (onlyLetters.charAt(i) != onlyLetters.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
