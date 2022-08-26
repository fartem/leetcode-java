package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/reordered-power-of-2/
public class ReorderedPowerOf2 {

    private final int input;

    public ReorderedPowerOf2(int input) {
        this.input = input;
    }

    public boolean solution() {
        int[] arr = count(input);
        for (int i = 0; i < 31; i++) {
            if (Arrays.equals(arr, count(1 << i))) {
                return true;
            }
        }
        return false;
    }

    private int[] count(int n) {
        int[] result = new int[10];
        while (n > 0) {
            result[n % 10]++;
            n /= 10;
        }
        return result;
    }

}
