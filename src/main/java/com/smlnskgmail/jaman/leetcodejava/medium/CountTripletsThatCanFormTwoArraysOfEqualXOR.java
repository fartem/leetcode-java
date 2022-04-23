package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor
public class CountTripletsThatCanFormTwoArraysOfEqualXOR {

    private final int[] input;

    public CountTripletsThatCanFormTwoArraysOfEqualXOR(int[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            int xor = input[i];
            for (int k = i + 1; k < input.length; k++) {
                xor ^= input[k];
                if (xor == 0) {
                    result += k - i;
                }
            }
        }
        return result;
    }

}
