package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/largest-odd-number-in-string
public class LargestOddNumberInString {

    private final String input;

    public LargestOddNumberInString(String input) {
        this.input = input;
    }

    public String solution() {
        for (int i = input.length() - 1; i >= 0; i--) {
            int candidate = input.charAt(i);
            if (candidate % 2 != 0) {
                return input.substring(0, i + 1);
            }
        }
        return "";
    }
}
