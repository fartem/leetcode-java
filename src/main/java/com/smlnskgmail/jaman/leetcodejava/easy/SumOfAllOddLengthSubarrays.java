package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
public class SumOfAllOddLengthSubarrays {

    private final int[] input;

    public SumOfAllOddLengthSubarrays(int[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int num = 1;
        int size = input.length;
        while (num <= size) {
            for (int i = 0; i < size; i++) {
                int index = i + num;
                if (index < size + 1) {
                    for (int j = i; j < index; j++) {
                        result += input[j];
                    }
                }
            }
            num += 2;
        }
        return result;
    }

}
