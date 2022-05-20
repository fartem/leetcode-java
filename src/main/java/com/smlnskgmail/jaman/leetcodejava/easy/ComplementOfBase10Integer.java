package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/complement-of-base-10-integer/
public class ComplementOfBase10Integer {

    private int input;

    public ComplementOfBase10Integer(int input) {
        this.input = input;
    }

    public int solution() {
        if (input == 0) {
            return 1;
        }
        int rev = 0;
        int pos = 0;
        while (input > 0) {
            rev |= (input & 1) == 1 ? 0 : 1 << pos;
            input >>= 1;
            pos++;
        }
        return rev;
    }

}
