package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/valid-palindrome-ii
public class ValidPalindromeII {

    private final String input;

    public ValidPalindromeII(String input) {
        this.input = input;
    }

    public boolean solution() {
        for (int i = 0; i < input.length() / 2; i++) {
            int index = input.length() - 1 - i;
            if (input.charAt(i) != input.charAt(index)) {
                return isPalindromeRange(input, i + 1, index)
                        || isPalindromeRange(input, i, index - 1);
            }
        }
        return true;
    }

    private boolean isPalindromeRange(String s, int i, int j) {
        for (int k = i; k <= i + (j - i) / 2; k++) {
            if (s.charAt(k) != s.charAt(j - k + i)) {
                return false;
            }
        }
        return true;
    }

}
