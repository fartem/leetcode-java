package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing
public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {

    private final int[] input;

    public RemoveOneElementToMakeTheArrayStrictlyIncreasing(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        boolean hasRemoving = false;
        for (int i = 0; i < input.length - 1; i++) {
            int curr = input[i];
            int next = input[i + 1];
            if (curr >= next) {
                if (hasRemoving) {
                    return false;
                }
                if (i == 0) {
                    input[i] = next - 1;
                } else {
                    int prev = input[i - 1];
                    if (next > prev) {
                        input[i] = prev;
                    } else {
                        input[i + 1] = curr;
                    }
                }
                hasRemoving = true;
            }
        }
        return true;
    }
}
