package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/add-digits
public class AddDigits {

    private int input;

    public AddDigits(int input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        while (input != 0) {
            int digit = input % 10;
            result += digit;
            input /= 10;
            if (input == 0 && result >= 10) {
                input = result;
                result = 0;
            }
        }
        return result;
    }
}
