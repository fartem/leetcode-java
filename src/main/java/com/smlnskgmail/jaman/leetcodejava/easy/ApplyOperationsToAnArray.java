package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/apply-operations-to-an-array/
public class ApplyOperationsToAnArray {

    private final int[] input;

    public ApplyOperationsToAnArray(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int n = input.length;
        int[] result = new int[n];
        if (n == 0) {
            return result;
        }
        int p = 0;
        for (int i = 0; i < n - 1; i++) {
            int curr = input[i];
            if (curr == input[i + 1] && curr != 0) {
                input[i] *= 2;
                result[p++] = input[i];
                input[i + 1] = 0;
            } else if (curr != 0) {
                result[p++] = curr;
            }
        }
        int last = input[n - 1];
        if (last != 0) {
            result[p] = last;
        }
        return result;
    }

}
