package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-difference-between-two-pairs
public class MaximumProductDifferenceBetweenTwoPairs {

    private final int[] input;

    public MaximumProductDifferenceBetweenTwoPairs(int[] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(input);
        int length = input.length;
        return (input[length - 1] * input[length - 2]) - (input[0] * input[1]);
    }
}
