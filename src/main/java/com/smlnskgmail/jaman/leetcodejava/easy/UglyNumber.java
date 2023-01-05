package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/ugly-number/
public class UglyNumber {

    private int input;

    public UglyNumber(int input) {
        this.input = input;
    }

    public boolean solution() {
        if (input <= 0) {
            return false;
        }
        for (int div : new int[]{2, 3, 5}) {
            while (input % div == 0) {
                input /= div;
            }
        }
        return input == 1;
    }

}
