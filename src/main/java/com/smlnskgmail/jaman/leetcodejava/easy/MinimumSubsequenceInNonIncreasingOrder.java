package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order
public class MinimumSubsequenceInNonIncreasingOrder {

    private final int[] input;

    public MinimumSubsequenceInNonIncreasingOrder(int[] input) {
        this.input = input;
    }

    public List<Integer> solution() {
        Arrays.sort(input);
        int sum = 0;
        for (int num : input) {
            sum += num;
        }
        int sub = 0;
        int pointer = input.length - 1;
        List<Integer> result = new ArrayList<>();
        while (sub <= sum) {
            int num = input[pointer--];
            sub += num;
            sum -= num;
            result.add(num);
        }
        return result;
    }

}
