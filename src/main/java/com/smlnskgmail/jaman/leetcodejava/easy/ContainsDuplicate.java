package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate
public class ContainsDuplicate {

    private final int[] input;

    public ContainsDuplicate(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            int number = input[i];
            if (uniqueNumbers.contains(i)) {
                return true;
            }
            uniqueNumbers.add(number);
        }
        return false;
    }

}
