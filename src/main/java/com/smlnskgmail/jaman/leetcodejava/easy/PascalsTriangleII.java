package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle-ii
public class PascalsTriangleII {

    private final int input;

    public PascalsTriangleII(int input) {
        this.input = input;
    }

    public List<Integer> solution() {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i <= input; i++) {
            for (int j = result.size() - 2; j >= 0; j--) {
                result.set(j + 1, result.get(j) + result.get(j + 1));
            }
            result.add(1);
        }
        return result;
    }
}
