package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/sum-of-digits-in-base-k
public class SumOfDigitsInBaseK {

    private final int n;
    private final int k;

    public SumOfDigitsInBaseK(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public int solution() {
        int sum = 0;
        String num = Integer.toString(n, k);
        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        return sum;
    }
}
