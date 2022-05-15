package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/longest-palindromic-substring
public class LongestPalindromicSubstring {

    private final String input;

    public LongestPalindromicSubstring(String input) {
        this.input = input;
    }

    public String solution() {
        int start = 0;
        int end = 0;
        for (int i = 0; i < input.length(); i++) {
            int[] first = expandFromCenter(i, i, input);
            int[] second = expandFromCenter(i, i + 1, input);
            int[] candidate = first[1] - first[0] > second[1] - second[0] ? first : second;
            if (end - start < candidate[1] - candidate[0]) {
                start = candidate[0];
                end = candidate[1];
            }
        }
        return input.substring(start, end);
    }

    private int[] expandFromCenter(int l, int r, String s) {
        int start = 0;
        int end = 0;
        while (l >= 0 && r < s.length() && l <= r && s.charAt(l) == s.charAt(r)) {
            if (end - start < r + 1 - l) {
                start = l;
                end = r + 1;
            }
            l--;
            r++;
        }
        return new int[]{start, end};
    }

}
