package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.*;

// https://leetcode.com/problems/intersection-of-multiple-arrays/
public class IntersectionOfMultipleArrays {

    private final int[][] input;

    public IntersectionOfMultipleArrays(int[][] input) {
        this.input = input;
    }

    public List<Integer> solution() {
        Map<Integer, Integer> numsWithCount = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int[] values : input) {
            for (int num : values) {
                int count = numsWithCount.getOrDefault(num, 0) + 1;
                numsWithCount.put(num, count);
                if (count == input.length) {
                    result.add(num);
                }
            }
        }
        Collections.sort(result);
        return result;
    }

}
