package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/sort-array-by-parity
public class SortArrayByParity {

    private final int[] input;

    public SortArrayByParity(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        for (int num : input) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }
        int evensLength = evens.size();
        for (int i = 0; i < input.length; i++) {
            if (i < evensLength) {
                input[i] = evens.get(i);
            } else {
                input[i] = odds.get(i - evensLength);
            }
        }
        return input;
    }

}
