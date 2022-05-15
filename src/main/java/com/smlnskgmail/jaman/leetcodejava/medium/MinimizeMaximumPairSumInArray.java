package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/minimize-maximum-pair-sum-in-array
public class MinimizeMaximumPairSumInArray {

    private final int[] input;

    public MinimizeMaximumPairSumInArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(input);
        int result = 0;
        for (int i = 0; i < input.length / 2; i++) {
            result = Math.max(result, input[i] + input[input.length - i - 1]);
        }
        return result;
    }

}
