package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/concatenation-of-array
public class ConcatenationOfArray {

    private final int[] input;

    public ConcatenationOfArray(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int[] result = new int[input.length * 2];
        System.arraycopy(input, 0, result, 0, input.length);
        System.arraycopy(input, 0, result, input.length, input.length);
        return result;
    }
}
