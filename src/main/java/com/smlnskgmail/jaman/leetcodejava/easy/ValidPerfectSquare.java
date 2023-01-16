package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/valid-perfect-square/
public class ValidPerfectSquare {

    private final int input;

    public ValidPerfectSquare(int input) {
        this.input = input;
    }

    public boolean solution() {
        long r = input;
        while (r * r > input) {
            r = (r + input / r) / 2;
        }
        return r * r == input;
    }

}
