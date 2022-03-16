package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-moves-to-convert-string
public class MinimumMovesToConvertString {

    private final String input;

    public MinimumMovesToConvertString(String input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int p = 0;
        while (p < input.length()) {
            if (input.charAt(p) == 'X') {
                result++;
                p += 3;
            } else {
                p++;
            }
        }
        return result;
    }

}
