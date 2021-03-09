package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/unique-number-of-occurrences
public class UniqueNumbersOfOccurrences {

    private final int[] input;

    public UniqueNumbersOfOccurrences(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        Map<Integer, Integer> numsAndCount = new HashMap<>();
        for (int num : input) {
            numsAndCount.put(num, numsAndCount.containsKey(num) ? numsAndCount.get(num) + 1 : 1);
        }
        Set<Integer> uniqueCount = new HashSet<>();
        for (Map.Entry<Integer, Integer> numAndCount : numsAndCount.entrySet()) {
            uniqueCount.add(numAndCount.getValue());
        }
        return numsAndCount.size() == uniqueCount.size();
    }

}
