package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/1-bit-and-2-bit-characters/
public class OneBitAndTwoBitCharacters {

    private final int[] input;

    public OneBitAndTwoBitCharacters(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        int pos = 0;
        while (pos < input.length - 1) {
            pos += input[pos] == 1 ? 2 : 1;
        }
        return pos == input.length - 1;
    }

}
