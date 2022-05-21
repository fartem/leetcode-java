package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/
public class NumberOfPairsOfStringsWithConcatenationEqualToTarget {

    private final String[] nums;
    private final String target;

    public NumberOfPairsOfStringsWithConcatenationEqualToTarget(
            String[] nums,
            String target
    ) {
        this.nums = nums;
        this.target = target;
    }

    public int solution() {
        Map<Integer, List<Pair>> pairs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            String num = nums[i];
            List<Pair> pair;
            int length = num.length();
            if (pairs.containsKey(length)) {
                pair = pairs.get(length);
            } else {
                pair = new ArrayList<>();
            }
            pair.add(new Pair(i, num));
            pairs.put(length, pair);
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            String num = nums[i];
            int candidateLength = target.length() - num.length();
            if (pairs.containsKey(candidateLength)) {
                for (Pair candidate : pairs.get(candidateLength)) {
                    if (candidate.index != i && (num + candidate.number).equals(target)) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    private static class Pair {

        public final int index;
        public final String number;

        private Pair(int index, String number) {
            this.index = index;
            this.number = number;
        }

    }

}
