package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/hamming-distance/
public class HammingDistance {

    private final int x;
    private final int y;

    public HammingDistance(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int solution() {
        int result = 0;
        for (int i = x ^ y; i > 0; result++) {
            i = i & (i - 1);
        }
        return result;
    }

}
