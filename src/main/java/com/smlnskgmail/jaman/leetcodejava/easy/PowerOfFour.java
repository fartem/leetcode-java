package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/power-of-four
public class PowerOfFour {

    private final int input;

    public PowerOfFour(int input) {
        this.input = input;
    }

    public boolean solution() {
        int num = input / 4;
        int pow = 0;
        while (num != 0) {
            num /= 4;
            pow++;
        }
        return Math.pow(4, pow) == input;
    }
}
