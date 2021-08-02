package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/three-divisors
public class ThreeDivisors {

    private final int input;

    public ThreeDivisors(int input) {
        this.input = input;
    }

    public boolean solution() {
        int divisors = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                divisors++;
            }
            if (divisors > 3) {
                return false;
            }
        }
        return divisors == 3;
    }

}
