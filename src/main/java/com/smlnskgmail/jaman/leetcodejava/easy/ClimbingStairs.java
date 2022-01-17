package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/climbing-stairs
public class ClimbingStairs {

    private final int input;

    public ClimbingStairs(int input) {
        this.input = input;
    }

    public int solution() {
        if (input < 4) {
            return input;
        }
        int prev = 0;
        int next = 1;
        for (int i = 0; i < input; ++i) {
            int sum = prev + next;
            prev = next;
            next = sum;
        }
        return next;
    }
}
