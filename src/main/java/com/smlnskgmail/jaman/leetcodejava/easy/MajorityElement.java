package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/majority-element
public class MajorityElement {

    private final int[] input;

    public MajorityElement(int[] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(input);
        return input[input.length / 2];
    }

}
