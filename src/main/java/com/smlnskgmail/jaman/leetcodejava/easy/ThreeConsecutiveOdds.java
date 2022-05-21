package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/three-consecutive-odds/
public class ThreeConsecutiveOdds {

    private final int[] input;

    public ThreeConsecutiveOdds(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        int count = 0;
        for (int num : input) {
            if (num % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else if (count != 0) {
                count = 0;
            }
        }
        return false;
    }

}
