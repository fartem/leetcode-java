package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/divide-two-integers/
public class DivideTwoIntegers {

    private int dividend;
    private int divisor;

    public DivideTwoIntegers(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public int solution() {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean neg = dividend < 0 ^ divisor < 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0;
        int subQuotient;
        while (dividend - divisor >= 0) {
            subQuotient = 0;
            while (dividend - (divisor << subQuotient << 1) >= 0) {
                subQuotient++;
            }
            quotient += 1 << subQuotient;
            dividend -= divisor << subQuotient;
        }
        return neg ? -quotient : quotient;
    }

}
