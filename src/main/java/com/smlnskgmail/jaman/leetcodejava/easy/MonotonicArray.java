package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/monotonic-array
public class MonotonicArray {

    private final int[] input;

    public MonotonicArray(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        boolean isInc = true;
        boolean isDec = true;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) {
                isDec = false;
            }
            if (input[i] < input[i + 1]) {
                isInc = false;
            }
            if (!isInc && !isDec) {
                break;
            }
        }
        return isInc || isDec;
    }

}
