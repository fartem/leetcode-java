package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/counting-bits/
public class CountingBits {

    private final int input;

    public CountingBits(int input) {
        this.input = input;
    }

    public int[] solution() {
        int[] result = new int[input + 1];
        for (int i = 0; i < input + 1; i++) {
            result[i] = Integer.bitCount(i);
        }
        return result;
    }

}
