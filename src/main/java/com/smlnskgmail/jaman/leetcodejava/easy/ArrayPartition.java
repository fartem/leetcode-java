package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/array-partition-i/
public class ArrayPartition {

    private final int[] input;

    public ArrayPartition(int[] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(input);
        int result = 0;
        for (int i = 0; i < input.length; i += 2) {
            result += Math.min(input[i], input[i + 1]);
        }
        return result;
    }

}
