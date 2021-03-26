package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/palindrome-number
public class PalindromeNumber {

    private final int input;

    public PalindromeNumber(int input) {
        this.input = input;
    }

    public boolean solution() {
        if (input < 0) {
            return false;
        }
        int num = input;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev == input;
    }

}
