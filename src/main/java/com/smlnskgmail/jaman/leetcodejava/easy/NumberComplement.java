package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-complement
public class NumberComplement {

    private int input;

    public NumberComplement(int input) {
        this.input = input;
    }

    public int solution() {
        int bits = (int) (Math.log(input) / Math.log(2)) + 1;
        for (int i = 0; i < bits; i++) {
            input = (input ^ (1 << i));
        }
        return input;
    }
}
