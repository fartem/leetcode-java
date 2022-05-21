package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/minimum-absolute-difference/
public class MinimumAbsoluteDifference {

    private final int[] input;

    public MinimumAbsoluteDifference(int[] input) {
        this.input = input;
    }

    public List<List<Integer>> solution() {
        Arrays.sort(input);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < input.length - 1; i++) {
            int abs = Math.abs(input[i] - input[i + 1]);
            if (diff > abs) {
                diff = abs;
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < input.length - 1; i++) {
            int fNum = input[i];
            int sNum = input[i + 1];
            if (Math.abs(fNum - sNum) == diff) {
                result.add(
                        Arrays.asList(
                                Math.min(fNum, sNum),
                                Math.max(fNum, sNum)
                        )
                );
            }
        }
        return result;
    }

}
