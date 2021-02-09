package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/single-number/solution
public class SingleNumber {

    private final int[] input;

    public SingleNumber(int[] input) {
        this.input = input;
    }

    public int solution() {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : input) {
            if (uniqueNums.contains(num)) {
                uniqueNums.remove(num);
            } else {
                uniqueNums.add(num);
            }
        }
        return uniqueNums.iterator().next();
    }

}
