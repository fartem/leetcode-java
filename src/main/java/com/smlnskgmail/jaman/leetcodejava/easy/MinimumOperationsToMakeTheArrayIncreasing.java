package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing
public class MinimumOperationsToMakeTheArrayIncreasing {

    private final int[] input;

    public MinimumOperationsToMakeTheArrayIncreasing(int[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int curr = input[0];
        for (int i = 1; i < input.length; i++) {
            int num = input[i];
            if (num <= curr) {
                int next = curr + 1;
                result += next - num;
                num = next;
            }
            curr = num;
        }
        return result;
    }
}
