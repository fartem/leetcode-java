package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/nth-digit/
public class NthDigit {

    private int input;

    public NthDigit(int input) {
        this.input = input;
    }

    public int solution() {
        int digit = 1;
        int interval = 9;
        while (input - interval > 0) {
            input -= interval;
            digit += 1;
            interval = (int) (9 * Math.pow(10, digit - 1) * digit);
            if (interval < 0) {
                break;
            }
        }
        int base = (int) Math.pow(10, digit - 1);
        int number = base + (input - 1) / digit;
        return String.valueOf(number).charAt((input - 1) % digit) - '0';
    }

}
