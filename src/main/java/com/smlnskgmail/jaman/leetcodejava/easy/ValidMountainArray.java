package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/valid-mountain-array
public class ValidMountainArray {

    private final int[] input;

    public ValidMountainArray(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        int i = 0;
        while (i + 1 < input.length && input[i] < input[i + 1]) {
            i++;
        }
        if (i == 0 || i == input.length - 1) {
            return false;
        }
        while (i + 1 < input.length && input[i] > input[i + 1]) {
            i++;
        }
        return i == input.length - 1;
    }

}
