package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/removing-minimum-and-maximum-from-array/
public class RemovingMinimumAndMaximumFromArray {

    private final int[] input;

    public RemovingMinimumAndMaximumFromArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        int length = input.length;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < length; i++) {
            int num = input[i];
            if (num > input[maxIndex]) {
                maxIndex = i;
            }
            if (num < input[minIndex]) {
                minIndex = i;
            }
        }
        int a = Math.max(minIndex, maxIndex) + 1;
        int b = length - Math.min(minIndex, maxIndex);
        int c = minIndex > maxIndex
                ? maxIndex + 1 + length - minIndex
                : minIndex + 1 + length - maxIndex;
        return Math.min(Math.min(a, b), c);
    }

}
