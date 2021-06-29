package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle
public class PascalsTriangle {

    private final int input;

    public PascalsTriangle(int input) {
        this.input = input;
    }

    public List<List<Integer>> solution() {
        List<List<Integer>> result = new ArrayList<>(input);
        result.add(Collections.singletonList(1));
        for (int i = 1; i < input; i++) {
            List<Integer> row = new ArrayList<>(i);
            row.add(0, 1);
            row.add(row.size() - 1, 1);
            if (i >= 2) {
                List<Integer> prev = result.get(i - 1);
                int pointer = 1;
                for (int j = 0; j < prev.size() - 1; j++) {
                    row.add(pointer++, prev.get(j) + prev.get(j + 1));
                }
            }
            result.add(row);
        }
        return result;
    }

}
