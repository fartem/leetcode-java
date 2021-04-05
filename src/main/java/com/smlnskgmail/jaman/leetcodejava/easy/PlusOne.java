package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/plus-one/submissions
public class PlusOne {

    private final int[] input;

    public PlusOne(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        boolean overflow = false;
        for (int i = input.length - 1; i >= 0; i--) {
            int digit = input[i] + 1;
            overflow = digit >= 10;
            if (overflow) {
                input[i] = 0;
            } else {
                input[i] = digit;
                break;
            }
        }
        if (overflow) {
            int[] result = Arrays.copyOf(
                    input,
                    input.length + 1
            );
            result[0] = 1;
            System.arraycopy(
                    input,
                    0,
                    result,
                    1,
                    input.length
            );
            return result;
        }
        return input;
    }

}
