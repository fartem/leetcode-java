package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/base-7
public class Base7 {

    private final int input;

    public Base7(int input) {
        this.input = input;
    }

    public String solution() {
        return Integer.toString(input, 7);
    }
}
