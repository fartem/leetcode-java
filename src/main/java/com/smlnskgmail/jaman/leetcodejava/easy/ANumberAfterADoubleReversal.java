package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/a-number-after-a-double-reversal
public class ANumberAfterADoubleReversal {

    private final int input;

    public ANumberAfterADoubleReversal(int input) {
        this.input = input;
    }

    public boolean solution() {
        return input == 0 || input % 10 != 0;
    }

}
