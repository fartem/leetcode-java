package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/running-sum-of-1d-array
public class RunningSumOf1DArray {

    private final int[] input;

    public RunningSumOf1DArray(int[] input) {
        this.input = input;
    }


    public int[] solution() {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            input[i] += sum;
            sum = input[i];
        }
        return input;
    }

}
