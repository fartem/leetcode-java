package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/smallest-even-multiple/
public class SmallestEvenMultiple {

    private final int input;

    public SmallestEvenMultiple(int input) {
        this.input = input;
    }

    public int solution() {
        return input % 2 == 0 ? input : input * 2;
    }

}
