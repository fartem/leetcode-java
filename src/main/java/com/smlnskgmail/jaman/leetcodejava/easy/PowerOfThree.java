package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/power-of-three/
public class PowerOfThree {

    private final int input;

    public PowerOfThree(int input) {
        this.input = input;
    }

    public boolean solution() {
        int num = input / 3;
        int pow = 0;
        while (num != 0) {
            num /= 3;
            pow++;
        }
        return Math.pow(3, pow) == input;
    }

}
