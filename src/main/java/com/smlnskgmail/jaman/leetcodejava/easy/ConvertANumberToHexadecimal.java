package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/convert-a-number-to-hexadecimal
public class ConvertANumberToHexadecimal {

    private final int input;

    public ConvertANumberToHexadecimal(int input) {
        this.input = input;
    }

    public String solution() {
        return Integer.toHexString(input);
    }
}
