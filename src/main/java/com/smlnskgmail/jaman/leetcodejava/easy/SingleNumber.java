package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/single-number/solution
public class SingleNumber {

    private final int[] input;

    public SingleNumber(int[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (int num : input) {
            result ^= num;
        }
        return result;
    }

}
