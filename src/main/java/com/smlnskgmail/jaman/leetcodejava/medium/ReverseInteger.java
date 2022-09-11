package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {

    private int input;

    public ReverseInteger(int input) {
        this.input = input;
    }

    public int solution() {
        int upperLimit = Integer.MAX_VALUE / 10;
        int lowerLimit = Integer.MIN_VALUE / 10;

        int result = 0;
        while (input != 0) {
            int pop = input % 10;
            input /= 10;

            if (result > upperLimit || (result == upperLimit && pop > 7)) {
                return 0;
            }
            if (result < lowerLimit || (result == lowerLimit && pop < -8)) {
                return 0;
            }
            result = result * 10 + pop;
        }
        return result;
    }

}
