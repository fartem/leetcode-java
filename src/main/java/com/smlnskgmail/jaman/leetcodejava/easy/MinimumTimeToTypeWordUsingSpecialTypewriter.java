package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter
public class MinimumTimeToTypeWordUsingSpecialTypewriter {

    private final String input;

    public MinimumTimeToTypeWordUsingSpecialTypewriter(String input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int prev = 1;
        for (int i = 0; i < input.length(); i++) {
            int c = input.charAt(i) - 'a' + 1;
            if (Math.abs(prev - c) > 13) {
                if (prev > c) {
                    int temp = 26 - prev;
                    result += temp + c + 1;
                } else {
                    int temp = 26 - c;
                    result += temp + prev + 1;
                }
            } else {
                result += Math.abs(prev - c) + 1;
            }
            prev = c;
        }
        return result;
    }
}
