package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/string-to-integer-atoi/
public class StringToIntegerAtoi {

    private final String input;

    public StringToIntegerAtoi(String input) {
        this.input = input;
    }

    public int solution() {
        int sign = 0;
        int start = 0;
        int length = input.length();
        while (start < length && input.charAt(start) == ' ') {
            start++;
        }
        if (start < length) {
            char c = input.charAt(start);
            sign = c == '-' ? -1 : 1;
            start += c == '-' || c == '+' ? 1 : 0;
        }
        int result = 0;
        while (start < length) {
            char c = input.charAt(start);
            if (!Character.isDigit(c)) {
                break;
            }
            int digit = c - '0';
            if ((result > Integer.MAX_VALUE / 10)
                    || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = 10 * result + digit;
            start++;
        }
        return result * sign;
    }

}
