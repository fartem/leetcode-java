package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/sum-of-two-integers
public class SumOfTwoIntegers {

    private int a;
    private int b;

    public SumOfTwoIntegers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int solution() {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
