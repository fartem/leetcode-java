package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/count-nice-pairs-in-an-array
public class CountNicePairsInAnArray {

    private static final int MODULO = 1_000_000_007;

    private final int[] input;

    public CountNicePairsInAnArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        for (int i = 0; i < input.length; i++) {
            input[i] -= rev(input[i]);
        }
        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;
        for (int num : input) {
            result += count.getOrDefault(num, 0);
            result %= MODULO;
            count.merge(num, 1, Integer::sum);
        }
        return result;
    }

    private int rev(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

}
