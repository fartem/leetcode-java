package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/climbing-stairs
public class ClimbingStairs {

    private final int input;

    public ClimbingStairs(int input) {
        this.input = input;
    }

    public int solution() {
        if (input == 1) {
            return 1;
        }
        int n1 = 1;
        int n2 = 2;
        for (int i = 3; i <= input; i++) {
            int temp = n1;
            n1 = n2;
            n2 += temp;
        }
        return n2;
    }

}
