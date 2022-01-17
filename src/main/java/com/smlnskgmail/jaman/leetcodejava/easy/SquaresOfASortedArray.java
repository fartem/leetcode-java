package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array
public class SquaresOfASortedArray {

    private final int[] input;

    public SquaresOfASortedArray(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        for (int i = 0; i < input.length; i++) {
            input[i] *= input[i];
        }
        Arrays.sort(input);
        return input;
    }
}
