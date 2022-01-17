package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/fibonacci-number
public class FibonacciNumber {

    private final int input;

    public FibonacciNumber(int input) {
        this.input = input;
    }

    public int solution() {
        if (input < 2) {
            return input;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i < input; i += 2) {
            first += second;
            if (i < input - 1) {
                second += first;
            }
        }
        return first + second;
    }
}
