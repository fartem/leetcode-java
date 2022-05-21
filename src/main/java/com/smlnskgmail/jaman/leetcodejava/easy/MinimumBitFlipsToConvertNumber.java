package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
public class MinimumBitFlipsToConvertNumber {

    private final int start;
    private final int goal;

    public MinimumBitFlipsToConvertNumber(int start, int goal) {
        this.start = start;
        this.goal = goal;
    }

    public int solution() {
        int n = start ^ goal;
        int result = 0;
        while (n > 0) {
            result += n & 1;
            n >>= 1;
        }
        return result;
    }

}
