package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/smallest-index-with-equal-value
public class SmallestIndexWithEqualValue {

    private final int[] input;

    public SmallestIndexWithEqualValue(int[] input) {
        this.input = input;
    }

    public int solution() {
        for (int i = 0; i < input.length; i++) {
            if (i % 10 == input[i]) {
                return i;
            }
        }
        return -1;
    }
}
