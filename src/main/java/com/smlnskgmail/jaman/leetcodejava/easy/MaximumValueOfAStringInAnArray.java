package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/
public class MaximumValueOfAStringInAnArray {

    private final String[] input;

    public MaximumValueOfAStringInAnArray(String[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (String str : input) {
            boolean isNumber = true;
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    isNumber = false;
                    break;
                }
            }
            if (isNumber) {
                result = Math.max(result, Integer.parseInt(str));
            } else {
                result = Math.max(result, str.length());
            }
        }
        return result;
    }

}
