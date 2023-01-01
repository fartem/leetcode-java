package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-the-digits-that-divide-a-number/
public class CountTheDigitsThatDivideANumber {

    private int input;

    public CountTheDigitsThatDivideANumber(int input) {
        this.input = input;
    }

    public int solution() {
        int original = input;
        int result = 0;
        while (input != 0) {
            int digit = input % 10;
            if (original % digit == 0) {
                result++;
            }
            input /= 10;
        }
        return result;
    }

}
