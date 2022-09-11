package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/sum-of-unique-elements/
public class SumOfUniqueElements {

    private final int[] input;

    public SumOfUniqueElements(int[] input) {
        this.input = input;
    }

    public int solution() {
        Map<Integer, Integer> numbers = new HashMap<>();
        int result = 0;
        for (int num : input) {
            if (numbers.containsKey(num)) {
                int count = numbers.get(num);
                if (count == 1) {
                    result -= num;
                }
                numbers.put(num, count + 1);
            } else {
                result += num;
                numbers.put(num, 1);
            }
        }
        return result;
    }

}
