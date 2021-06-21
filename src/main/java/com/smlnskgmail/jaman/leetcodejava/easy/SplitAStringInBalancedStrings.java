package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/split-a-string-in-balanced-strings
public class SplitAStringInBalancedStrings {

    private final String input;

    public SplitAStringInBalancedStrings(String input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        char last = input.charAt(0);
        int r = last == 'R' ? 1 : 0;
        int l = last == 'L' ? 1 : 0;
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);
            if (last == c) {
                r += last == 'R' ? 1 : 0;
                l += last == 'L' ? 1 : 0;
            } else {
                last = c;
                r -= last == 'L' ? 1 : 0;
                l -= last == 'R' ? 1 : 0;
            }
            if (r == l) {
                result++;
            }
        }
        return result;
    }

}
