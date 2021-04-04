package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/n-repeated-element-in-size-2n-array
public class NRepeatedElementInSize2NArray {

    private final int[] input;

    public NRepeatedElementInSize2NArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        Set<Integer> uniq = new HashSet<>();
        for (int num : input) {
            if (uniq.contains(num)) {
                return num;
            } else {
                uniq.add(num);
            }
        }
        return 0;
    }

}
