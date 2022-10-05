package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-prefix-divisible-by-5/
public class BinaryPrefixDivisibleBy5 {

    private final int[] input;

    public BinaryPrefixDivisibleBy5(int[] input) {
        this.input = input;
    }

    public List<Boolean> solution() {
        List<Boolean> result = new ArrayList<>();
        int n = 0;
        for (int num : input) {
            n = (n * 2 + num) % 10;
            result.add(n == 5 || n == 0);
        }
        return result;
    }

}
