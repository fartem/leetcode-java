package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x
public class SpecialArrayWithXElementsGreaterThanOrEqualX {

    private final int[] input;

    public SpecialArrayWithXElementsGreaterThanOrEqualX(int[] input) {
        this.input = input;
    }

    public int solution() {
        for (int i = input.length; i >= 0; i--) {
            int count = 0;
            for (int num : input) {
                if (num >= i) {
                    count++;
                }
            }
            if (count == i) {
                return i;
            }
        }
        return -1;
    }

}
