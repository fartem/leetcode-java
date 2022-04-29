package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/the-kth-factor-of-n
public class TheKthFactorOfN {

    private final int n;
    private final int k;

    public TheKthFactorOfN(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public int solution() {
        int[] factors = new int[k];
        int p = 0;
        for (int i = 1; i <= n && p < k; i++) {
            if (n % i == 0) {
                factors[p++] = i;
            }
        }
        return p < k ? -1 : factors[k - 1];
    }

}
