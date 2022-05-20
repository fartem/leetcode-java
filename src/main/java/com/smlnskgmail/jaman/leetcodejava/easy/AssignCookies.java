package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/assign-cookies/
public class AssignCookies {

    private final int[] g;
    private final int[] s;

    public AssignCookies(int[] g, int[] s) {
        this.g = g;
        this.s = s;
    }

    public int solution() {
        Arrays.sort(g);
        Arrays.sort(s);
        int gPointer = 0;
        int sPointer = 0;
        int result = 0;
        while (gPointer < g.length && sPointer < s.length) {
            while (sPointer < s.length && s[sPointer] < g[gPointer]) {
                sPointer++;
            }
            if (sPointer < s.length) {
                result++;
                gPointer++;
                sPointer++;
            }
        }
        return result;
    }

}
