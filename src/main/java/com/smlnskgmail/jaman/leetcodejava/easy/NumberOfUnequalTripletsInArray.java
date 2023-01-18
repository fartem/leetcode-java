package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-of-unequal-triplets-in-array/
public class NumberOfUnequalTripletsInArray {

    private final int[] input;

    public NumberOfUnequalTripletsInArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int n = input.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (input[i] != input[j] && input[j] != input[k] && input[i] != input[k]) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

}
