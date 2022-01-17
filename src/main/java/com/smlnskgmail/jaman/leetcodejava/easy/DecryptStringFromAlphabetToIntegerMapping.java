package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping
public class DecryptStringFromAlphabetToIntegerMapping {

    private final String input;

    public DecryptStringFromAlphabetToIntegerMapping(String input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        int pointer = 0;
        int length = input.length();
        while (pointer < length) {
            char c = input.charAt(pointer);
            if ((c == '1' || c == '2')
                    && pointer + 2 < length
                    && input.charAt(pointer + 2) == '#') {
                int num = Integer.parseInt(input.substring(pointer, pointer + 2));
                result.append((char) (num + 96));
                pointer += 3;
            } else {
                result.append((char) (c + 48));
                pointer++;
            }
        }
        return result.toString();
    }
}
