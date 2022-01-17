package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/roman-to-integer
public class RomanToInteger {

    private static final int[] VALUES = new int[100];

    private final String input;

    public RomanToInteger(String input) {
        this.input = input;
    }

    public int solution() {
        if (VALUES['I'] == 0) {
            VALUES['I'] = 1;
            VALUES['V'] = 5;
            VALUES['X'] = 10;
            VALUES['L'] = 50;
            VALUES['C'] = 100;
            VALUES['D'] = 500;
            VALUES['M'] = 1000;
        }
        int result = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            int curr = VALUES[input.charAt(i)];
            if (curr * 4 < result) {
                result -= curr;
            } else {
                result += curr;
            }
        }
        return result;
    }
}
