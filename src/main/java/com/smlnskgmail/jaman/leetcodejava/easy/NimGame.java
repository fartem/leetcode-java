package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/nim-game
public class NimGame {

    private final int input;

    public NimGame(int input) {
        this.input = input;
    }

    public boolean solution() {
        return input % 4 != 0;
    }

}
