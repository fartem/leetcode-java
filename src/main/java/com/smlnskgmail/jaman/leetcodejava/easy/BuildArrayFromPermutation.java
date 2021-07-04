package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/build-array-from-permutation
public class BuildArrayFromPermutation {

    private final int[] input;

    public BuildArrayFromPermutation(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[input[i]];
        }
        return result;
    }

}
