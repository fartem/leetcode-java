package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-of-1-bitsa/
public class NumberOf1Bits {

    private final int input;

    public NumberOf1Bits(int input) {
        this.input = input;
    }

    public int solution() {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int bit = input & (1 << i);
            if (bit != 0) {
                count++;
            }
        }
        return count;
    }

}
