package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-the-pivot-integer/
public class FindThePivotInteger {

    private final int input;

    public FindThePivotInteger(int input) {
        this.input = input;
    }

    public int solution() {
        int sum = input * (input + 1) / 2;
        int value = 0;
        for (int i = input; i > 0; i--) {
            value += i;
            if (sum == value) {
                return i;
            }
            sum -= i;
        }
        return -1;
    }

}
