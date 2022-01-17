package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/mean-of-array-after-removing-some-elements
public class MeanOfArrayAfterRemovingSomeElements {

    private final int[] input;

    public MeanOfArrayAfterRemovingSomeElements(int[] input) {
        this.input = input;
    }

    public double solution() {
        int fivePercent = (int) (input.length / 100.0 * 5);
        Arrays.sort(input);
        int result = 0;
        for (int i = fivePercent; i < input.length - fivePercent; i++) {
            result += input[i];
        }
        return (double) result / (input.length - fivePercent * 2);
    }
}
