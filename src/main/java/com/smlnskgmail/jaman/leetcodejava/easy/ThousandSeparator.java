package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/thousand-separator
public class ThousandSeparator {

    private final int input;

    public ThousandSeparator(int input) {
        this.input = input;
    }

    public String solution() {
        String number = String.valueOf(input);
        int length = number.length();
        int pointer = length % 3 == 0 ? 3 : length % 3;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(number.charAt(i));
            pointer--;
            if (pointer == 0 && i != length - 1) {
                pointer = 3;
                result.append('.');
            }
        }
        return result.toString();
    }
}
