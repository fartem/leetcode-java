package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/arranging-coins
public class ArrangingCoins {

    private int input;

    public ArrangingCoins(int input) {
        this.input = input;
    }

    public int solution() {
        int stairs = 1;
        while (input > 0) {
            input -= stairs;
            stairs++;
        }
        return stairs - (input == 0 ? 1 : 2);
    }

}
