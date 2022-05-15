package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/missing-number
public class MissingNumber {

    private final int[] input;

    public MissingNumber(int[] input) {
        this.input = input;
    }

    public int solution() {
        int max = input.length;
        int sum = 0;
        for (int num : input) {
            sum += num;
        }
        return max * (max + 1) / 2 - sum;
    }

}
