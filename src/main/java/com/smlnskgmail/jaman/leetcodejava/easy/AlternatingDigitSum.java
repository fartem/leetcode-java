package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/alternating-digit-sum/
public class AlternatingDigitSum {

    private final int input;

    public AlternatingDigitSum(int input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int factor = 1;
        String num = String.valueOf(input);
        for (int i = 0; i < num.length(); i++) {
            result += Character.getNumericValue(num.charAt(i)) * factor;
            factor *= -1;
        }
        return result;
    }

}
