package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/sign-of-the-product-of-an-array
public class SignOfTheProductOfAnArray {

    private final int[] input;

    public SignOfTheProductOfAnArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        int positive = 0;
        for (int num : input) {
            if (num == 0) {
                return 0;
            }
            if (num > 0) {
                positive++;
            }
        }
        return (input.length - positive) % 2 == 0 ? 1 : -1;
    }

}
