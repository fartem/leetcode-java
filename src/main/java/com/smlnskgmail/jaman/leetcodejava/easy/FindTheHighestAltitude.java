package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-the-highest-altitude
public class FindTheHighestAltitude {

    private final int[] input;

    public FindTheHighestAltitude(int[] input) {
        this.input = input;
    }

    public int solution() {
        int high = input[0];
        int curr = high;
        for (int i = 1; i < input.length; i++) {
            curr += input[i];
            if (curr > high) {
                high = curr;
            }
        }
        return Math.max(high, 0);
    }
}
