package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicatesInAnArray {

    private final int[] input;

    public FindAllDuplicatesInAnArray(int[] input) {
        this.input = input;
    }

    public List<Integer> solution() {
        Arrays.sort(input);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length - 1; i++) {
            int num = input[i];
            if (num == input[i + 1]) {
                result.add(num);
                i++;
            }
        }
        return result;
    }

}
