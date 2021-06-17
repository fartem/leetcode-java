package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence
public class CanMakeArithmeticProgressionFromSequence {

    private final int[] input;

    public CanMakeArithmeticProgressionFromSequence(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        Arrays.sort(input);
        if (input.length > 2) {
            int diff = input[0] - input[1];
            for (int i = 2; i < input.length; i++) {
                int tempDiff = input[i - 1] - input[i];
                if (diff != tempDiff) {
                    return false;
                }
            }
        }
        return true;
    }

}
