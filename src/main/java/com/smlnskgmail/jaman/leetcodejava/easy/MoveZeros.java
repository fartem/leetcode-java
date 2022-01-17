package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/move-zeroes
public class MoveZeros {

    private final int[] input;

    public MoveZeros(int[] input) {
        this.input = input;
    }

    public void solution() {
        int pointer = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                input[pointer] = input[i];
                pointer++;
            }
        }
        for (int j = pointer; j < input.length; j++) {
            input[j] = 0;
        }
    }
}
