package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/shuffle-the-array
public class ShuffleTheArray {

    private final int[] input;
    private final int n;

    public ShuffleTheArray(int[] input, int n) {
        this.input = input;
        this.n = n;
    }

    public int[] solution() {
        int[] solution = new int[input.length];
        for (int i = 0, j = 0, ind = 0; ind < input.length; ind++, i++, j++) {
            solution[ind] = input[i];
            solution[++ind] = input[n + j];
        }
        return solution;
    }

}
