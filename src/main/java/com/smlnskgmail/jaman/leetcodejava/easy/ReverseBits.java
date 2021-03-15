package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/reverse-bits
public class ReverseBits {

    private final int input;

    public ReverseBits(int input) {
        this.input = input;
    }

    public int solution() {
        return Integer.reverse(input);
    }

}
