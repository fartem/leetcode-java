package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/perfect-number
public class PerfectNumber {

    private final int input;

    public PerfectNumber(int input) {
        this.input = input;
    }

    public boolean solution() {
        int sum = 0;
        for (int i = 1; i * i <= input; i++) {
            if (input % i == 0) {
                sum += i;
                if (i * i != input) {
                    sum += input / i;
                }
            }
        }
        return sum - input == input;
    }

}
