package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/check-if-n-and-its-double-exist
public class CheckIfNAndItsDoubleExist {

    private final int[] input;

    public CheckIfNAndItsDoubleExist(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        Set<Integer> nums = new HashSet<>();
        for (int num : input) {
            if (nums.contains(num * 2) || (num % 2 == 0 && nums.contains(num / 2))) {
                return true;
            } else {
                nums.add(num);
            }
        }
        return false;
    }
}
