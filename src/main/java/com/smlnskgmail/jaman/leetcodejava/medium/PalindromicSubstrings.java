package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/palindromic-substrings/
public class PalindromicSubstrings {

    private final String input;

    public PalindromicSubstrings(String input) {
        this.input = input;
    }

    public int solution() {
        int result = input.length();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (isPalindrome(input, i, j)) {
                    result++;
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
