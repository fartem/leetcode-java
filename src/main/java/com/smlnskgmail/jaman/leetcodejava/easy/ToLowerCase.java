package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/to-lower-case/
public class ToLowerCase {

    private final String input;

    public ToLowerCase(String input) {
        this.input = input;
    }

    public String solution() {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int c = chars[i];
            if (c > 64 && c < 91) {
                chars[i] = (char) (c + 32);
            }
        }
        return String.valueOf(chars);
    }

}
