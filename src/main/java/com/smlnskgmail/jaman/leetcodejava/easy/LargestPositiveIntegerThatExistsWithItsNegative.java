package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
public class LargestPositiveIntegerThatExistsWithItsNegative {

    private final int[] input;

    public LargestPositiveIntegerThatExistsWithItsNegative(int[] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(input);
        Set<Integer> set = new HashSet<>();
        for (int num : input) {
            set.add(num);
        }
        for (int i = input.length - 1; i >= 0; i--) {
            int num = input[i];
            if (num > 0) {
                if (set.contains(-num)) {
                    return num;
                }
            } else {
                break;
            }
        }
        return -1;
    }

}
