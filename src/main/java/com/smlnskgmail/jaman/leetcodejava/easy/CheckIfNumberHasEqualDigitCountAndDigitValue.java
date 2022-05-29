package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
public class CheckIfNumberHasEqualDigitCountAndDigitValue {

    private final String input;

    public CheckIfNumberHasEqualDigitCountAndDigitValue(String input) {
        this.input = input;
    }

    public boolean solution() {
        int[] count = new int[10];
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i) - '0']++;
        }
        for (int i = 0; i < input.length(); i++) {
            int n = input.charAt(i) - '0';
            if (n != count[i]) {
                return false;
            }
        }
        return true;
    }

}
