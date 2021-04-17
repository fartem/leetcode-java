package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/sort-array-by-increasing-frequency
public class SortArrayByIncreasingFrequency {

    private final int[] input;

    public SortArrayByIncreasingFrequency(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        Map<Integer, Integer> freq = new HashMap<>();
        Integer[] castedNums = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            int num = input[i];
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
            castedNums[i] = num;
        }
        Arrays.sort(
                castedNums,
                (i1, i2) -> {
                    if (i1.equals(i2)) {
                        return 0;
                    }
                    int i1Freq = freq.get(i1);
                    int i2Freq = freq.get(i2);
                    if (i1Freq != i2Freq) {
                        return Integer.compare(i1Freq, i2Freq);
                    }
                    return -i1.compareTo(i2);
                }
        );
        for (int i = 0; i < input.length; i++) {
            input[i] = castedNums[i];
        }
        return input;
    }

}
