package com.smlnskgmail.jaman.leetcodejava.hard;

// https://leetcode.com/problems/number-of-digit-one/
public class NumberOfDigitOne {

    private final int input;

    public NumberOfDigitOne(int input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (int i = 1; i <= input; i *= 10) {
            int div = i * 10;
            result += (input / div) * i + Math.min(Math.max(input % div - i + 1, 0), i);
        }
        return result;
    }

}
