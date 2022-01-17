package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three
public class CheckIfNumberIsASumOfPowersOfThree {

    private final int input;

    public CheckIfNumberIsASumOfPowersOfThree(int input) {
        this.input = input;
    }

    public boolean solution() {
        return Integer.toString(input, 3).indexOf('2') == -1;
    }
}
