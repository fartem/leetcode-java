package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/height-checker/
public class HeightChecker {

    private final int[] input;

    public HeightChecker(int[] input) {
        this.input = input;
    }

    public int solution() {
        int[] expected = Arrays.copyOf(input, input.length);
        Arrays.sort(expected);
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != expected[i]) {
                result++;
            }
        }
        return result;
    }

}
