package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/
public class RemoveDigitFromNumberToMaximizeResult {

    private final String number;
    private final char digit;

    public RemoveDigitFromNumberToMaximizeResult(String number, char digit) {
        this.number = number;
        this.digit = digit;
    }

    public String solution() {
        String result = "";
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c == digit) {
                String num = number.substring(0, i) + number.substring(i + 1);
                result = result.compareTo(num) < 0 ? num : result;
            }
        }
        return result;
    }

}
