package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero
public class FindNUniqueIntegersSumUpToZero {

    private final int input;

    public FindNUniqueIntegersSumUpToZero(int input) {
        this.input = input;
    }

    public int[] solution() {
        if (input == 1) {
            return new int[]{0};
        }
        int[] result = new int[input];
        int middle = input / 2;
        for (int i = 0; i < input; i++) {
            if (i == middle) {
                result[i] = input % 2 != 0 ? 0 : middle;
            } else if (i < middle) {
                result[i] = -middle + i;
            } else {
                result[i] = i - middle;
            }
        }
        return result;
    }

}
