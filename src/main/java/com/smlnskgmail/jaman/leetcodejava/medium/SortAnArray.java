package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/sort-an-array/
public class SortAnArray {

    private final int[] input;

    public SortAnArray(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        Arrays.sort(input);
        return input;
    }

}
