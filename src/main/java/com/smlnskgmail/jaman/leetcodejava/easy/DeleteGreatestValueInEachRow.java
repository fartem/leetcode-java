package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/delete-greatest-value-in-each-row/
public class DeleteGreatestValueInEachRow {

    private final int[][] input;

    public DeleteGreatestValueInEachRow(int[][] input) {
        this.input = input;
    }

    public int solution() {
        for (int[] line : input) {
            Arrays.sort(line);
        }
        int result = 0;
        for (int i = 0; i < input[0].length; i++) {
            int max = 0;
            for (int[] ints : input) {
                max = Math.max(max, ints[i]);
            }
            result += max;
        }
        return result;
    }

}
