package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberOfStepsToReduceANumberToZero {

    private int input;

    public NumberOfStepsToReduceANumberToZero(int input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        while (input != 0) {
            input = input % 2 == 0 ? input / 2 : input - 1;
            result++;
        }
        return result;
    }
}
