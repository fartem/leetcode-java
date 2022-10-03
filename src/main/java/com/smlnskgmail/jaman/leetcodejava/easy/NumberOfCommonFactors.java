package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-of-common-factors/
public class NumberOfCommonFactors {

    private final int a;
    private final int b;

    public NumberOfCommonFactors(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int solution() {
        int result = 0;
        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                result++;
            }
        }
        return result;
    }

}
