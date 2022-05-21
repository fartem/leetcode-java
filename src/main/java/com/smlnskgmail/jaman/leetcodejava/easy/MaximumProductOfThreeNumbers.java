package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-of-three-numbers/
public class MaximumProductOfThreeNumbers {

    private final int[] input;

    public MaximumProductOfThreeNumbers(int[] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(input);
        int length = input.length;
        return Math.max(
                input[0] * input[1] * input[length - 1],
                input[length - 1] * input[length - 2] * input[length - 3]
        );
    }

}
