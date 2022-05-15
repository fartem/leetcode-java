package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;

// https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers
public class CheckIfEveryRowAndColumnContainsAllNumbers {

    private final int[][] input;

    public CheckIfEveryRowAndColumnContainsAllNumbers(int[][] input) {
        this.input = input;
    }

    public boolean solution() {
        for (var row : input) {
            var rows = new HashSet<Integer>();
            for (int i = 0; i < input.length; i++) {
                if (!rows.add(row[i])) {
                    return false;
                }
            }
        }
        for (int i = 0; i < input.length; i++) {
            var columns = new HashSet<Integer>();
            for (var column : input) {
                if (!columns.add(column[i])) {
                    return false;
                }
            }
        }
        return true;
    }

}
