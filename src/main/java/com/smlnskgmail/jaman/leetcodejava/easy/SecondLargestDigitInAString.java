package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/second-largest-digit-in-a-string
public class SecondLargestDigitInAString {

    private final String input;

    public SecondLargestDigitInAString(String input) {
        this.input = input;
    }

    public int solution() {
        int max = -1;
        int result = -1;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                if (num > max) {
                    result = max;
                    max = num;
                } else if (num > result && num != max) {
                    result = num;
                }
            }
        }
        return result;
    }
}
