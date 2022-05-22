package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/palindromic-substrings/
public class PalindromicSubstrings {

    private final String s;

    public PalindromicSubstrings(String input) {
        this.s = input;
    }

    public int solution() {
        int result = s.length();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindrome(s, i, j)) {
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
