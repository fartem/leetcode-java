package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/divisor-game
public class DivisorGame {

    private final int input;

    public DivisorGame(int input) {
        this.input = input;
    }

    public boolean solution() {
        return input % 2 == 0;
    }
}
