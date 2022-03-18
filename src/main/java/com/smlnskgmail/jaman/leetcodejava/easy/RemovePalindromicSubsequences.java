package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/remove-palindromic-subsequences
public class RemovePalindromicSubsequences {

    private final String input;

    public RemovePalindromicSubsequences(String input) {
        this.input = input;
    }

    public int solution() {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) == input.charAt(end)) {
                start++;
                end--;
            } else {
                return 2;
            }
        }
        return 1;
    }

}
