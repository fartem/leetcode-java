package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
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
                Comparator.comparingInt(Integer::bitCount).thenComparingInt(i -> i)
        );
        for (int i = 0; i < input.length; i++) {
            input[i] = nums[i];
        }
        return input;
    }

}
