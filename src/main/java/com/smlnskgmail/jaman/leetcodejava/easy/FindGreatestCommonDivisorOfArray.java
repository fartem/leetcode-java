package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/find-greatest-common-divisor-of-array
public class FindGreatestCommonDivisorOfArray {

    private final int[] input;

    public FindGreatestCommonDivisorOfArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(input);
        int min = input[0];
        int max = input[input.length - 1];
        return gcd(min, max);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
