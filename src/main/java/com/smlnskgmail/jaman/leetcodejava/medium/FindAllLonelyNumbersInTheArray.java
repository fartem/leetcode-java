package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/find-all-lonely-numbers-in-the-array
public class FindAllLonelyNumbersInTheArray {

    private final int[] input;

    public FindAllLonelyNumbersInTheArray(int[] input) {
        this.input = input;
    }

    public List<Integer> solution() {
        Map<Integer, Integer> numsWithCount = new HashMap<>();
        for (int num : input) {
            numsWithCount.put(num, numsWithCount.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : input) {
            if (numsWithCount.get(num) == 1
                    && !numsWithCount.containsKey(num - 1)
                    && !numsWithCount.containsKey(num + 1)) {
                result.add(num);
            }
        }
        return result;
    }

}
