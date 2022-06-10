package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/jump-game/
public class JumpGame {

    private final int[] input;

    public JumpGame(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        int length = input.length;
        int i;
        int max = 0;
        for (i = 0; i < length; i++) {
            max = Math.max(input[i], max - 1);
            if (max < 1) {
                break;
            }
        }
        return i >= length - 1;
    }

}
