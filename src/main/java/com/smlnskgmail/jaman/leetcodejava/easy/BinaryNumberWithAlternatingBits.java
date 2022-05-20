package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/binary-number-with-alternating-bits/
public class BinaryNumberWithAlternatingBits {

    private int input;

    public BinaryNumberWithAlternatingBits(int input) {
        this.input = input;
    }

    public boolean solution() {
        int curr = input % 2;
        input /= 2;
        while (input > 0) {
            if (curr == input % 2) {
                return false;
            }
            curr = input % 2;
            input /= 2;
        }
        return true;
    }

}
