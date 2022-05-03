package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
public class FindAllNumbersDisappearedInAnArray {

    private final int[] input;

    public FindAllNumbersDisappearedInAnArray(int[] input) {
        this.input = input;
    }

    public List<Integer> solution() {
        int i = 0;
        while (i < input.length) {
            int curr = input[i];
            int pos = curr - 1;
            if (curr != input[pos]) {
                input[i] = input[pos];
                input[pos] = curr;
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < input.length; j++) {
            if (input[j] != j + 1) {
                result.add(j + 1);
            }
        }
        return result;
    }

}
