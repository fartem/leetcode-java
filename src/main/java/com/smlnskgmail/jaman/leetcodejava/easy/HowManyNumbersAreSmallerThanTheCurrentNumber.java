package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    private final int[] input;

    public HowManyNumbersAreSmallerThanTheCurrentNumber(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int[] original = Arrays.copyOf(input, input.length);
        Arrays.sort(input);
        Map<Integer, Integer> numsAndCount = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            numsAndCount.putIfAbsent(input[i], i);
        }
        for (int i = 0; i < original.length; i++) {
            int value = original[i];
            original[i] = numsAndCount.getOrDefault(value, 0);
        }
        return original;
    }

}
