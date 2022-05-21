package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
public class SumOfAbsoluteDifferencesInASortedArray {

    private final int[] input;

    public SumOfAbsoluteDifferencesInASortedArray(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int n = input.length;
        for (int i = 1; i < n; i++) {
            input[i] += input[i - 1];
        }
        int[] result = new int[n];
        result[0] = input[n - 1] - n * input[0];
        for (int i = 1; i < n; i++) {
            int left = input[i - 1];
            int right = input[n - 1] - input[i];
            int current = input[i] - left;
            result[i] = i * current - left + right - (n - i - 1) * current;
        }
        return result;
    }

}
