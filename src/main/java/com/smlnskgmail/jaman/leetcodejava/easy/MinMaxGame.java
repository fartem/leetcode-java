package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/min-max-game/
public class MinMaxGame {

    private final int[] input;

    public MinMaxGame(int[] input) {
        this.input = input;
    }

    public int solution() {
        int n = input.length;
        for (int i = 0; i < input.length / 2; i++) {
            int j = 0;
            for (int k = 1; k < n; k += 2, j++) {
                if (j % 2 == 0) {
                    input[j] = Math.min(input[k], input[k - 1]);
                } else {
                    input[j] = Math.max(input[k], input[k - 1]);
                }
            }
            n /= 2;
        }
        return input[0];
    }

}
