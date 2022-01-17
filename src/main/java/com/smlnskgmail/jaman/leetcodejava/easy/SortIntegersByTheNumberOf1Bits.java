package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits
public class SortIntegersByTheNumberOf1Bits {

    private final int[] input;

    public SortIntegersByTheNumberOf1Bits(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        Integer[] nums = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = input[i];
        }
        Arrays.sort(
                nums,
                (i1, i2) -> {
                    int bitsCompare = Integer.compare(Integer.bitCount(i1), Integer.bitCount(i2));
                    return bitsCompare != 0 ? bitsCompare : Integer.compare(i1, i2);
                });
        for (int i = 0; i < input.length; i++) {
            input[i] = nums[i];
        }
        return input;
    }
}
