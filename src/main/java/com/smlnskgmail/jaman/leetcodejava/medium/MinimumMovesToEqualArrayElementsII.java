package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
public class MinimumMovesToEqualArrayElementsII {

    private final int[] input;

    public MinimumMovesToEqualArrayElementsII(int[] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(input);
        int n = input.length;
        int m = n % 2 == 0 ? (input[n / 2] + input[n / 2 - 1]) / 2 : input[n / 2];
        int result = 0;
        for (int num : input) {
            result += Math.abs(m - num);
        }
        return result;
    }

}
