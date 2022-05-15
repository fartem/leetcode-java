package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/rearrange-array-elements-by-sign
public class RearrangeArrayElementsBySign {

    private final int[] input;

    public RearrangeArrayElementsBySign(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int[] copy = Arrays.copyOf(input, input.length);
        int length = copy.length;
        for (int i = 0, j = 0, k = 0; i < length; i += 2) {
            while (copy[j] < 0) {
                j++;
            }
            while (copy[k] > 0) {
                k++;
            }
            input[i] = copy[j++];
            input[i + 1] = copy[k++];
        }
        return input;
    }

}
