package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-69-number
public class Maximum69Number {

    private final int input;

    public Maximum69Number(int input) {
        this.input = input;
    }

    public int solution() {
        int max = input;
        int mul = 10;
        int temp = input;
        while (temp > 0) {
            int n = temp % 10 == 6 ? 3 : -3;
            int m = mul + n * mul / 10;
            int candidate = input - mul + m;
            if (candidate > max) {
                max = candidate;
            }
            mul *= 10;
            temp /= 10;
        }
        return max;
    }
}
