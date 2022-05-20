package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
public class CheckIfArrayIsSortedAndRotated {

    private final int[] input;

    public CheckIfArrayIsSortedAndRotated(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        int change = 0;
        int last = input[0];
        for (int i = 1; i < input.length; i++) {
            int num = input[i];
            if (last > num) {
                if (++change > 1) {
                    return false;
                }
            }
            last = num;
        }
        if (change == 1) {
            return input[input.length - 1] <= input[0];
        }
        return true;
    }

}
