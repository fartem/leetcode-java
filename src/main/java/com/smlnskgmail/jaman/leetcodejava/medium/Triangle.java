package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.List;

// https://leetcode.com/problems/triangle/
public class Triangle {

    private final List<List<Integer>> input;

    public Triangle(List<List<Integer>> input) {
        this.input = input;
    }

    public int solution() {
        int size = input.size();
        if (size == 1) {
            return input.get(0).get(0);
        }
        int[] result = new int[size + 1];
        for (int i = size - 1; i >= 0; i--) {
            int currSize = input.get(i).size();
            for (int j = 0; j < currSize; j++) {
                result[j] = Math.min(result[j], result[j + 1]) + input.get(i).get(j);
            }
        }
        return result[0];
    }

}
