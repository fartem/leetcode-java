package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/repeated-substring-pattern/
public class RepeatedSubstringPattern {

    private final String input;

    public RepeatedSubstringPattern(String input) {
        this.input = input;
    }

    public boolean solution() {
        int length = input.length();
        for (int i = 1; i <= length / 2; i++) {
            if (length % i == 0) {
                String sub = input.substring(0, i);
                if (sub.repeat(length / sub.length()).equals(input)) {
                    return true;
                }
            }
        }
        return false;
    }

}
