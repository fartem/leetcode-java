package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/power-of-two
public class PowerOfTwo {

    private final int input;

    public PowerOfTwo(int input) {
        this.input = input;
    }

    public boolean solution() {
        int num = input / 2;
        int pow = 0;
        while (num != 0) {
            num /= 2;
            pow++;
        }
        return Math.pow(2, pow) == input;
    }

}
