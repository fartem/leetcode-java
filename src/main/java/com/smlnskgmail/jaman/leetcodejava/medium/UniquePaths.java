package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/unique-paths/
public class UniquePaths {

    private final Map<String, Integer> map = new HashMap<>();

    private final int m;
    private final int n;

    public UniquePaths(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int solution() {
        return uniquePaths(m, n);
    }

    private int uniquePaths(int m, int n) {
        if (n < 2 || m < 2) {
            return Math.min(n, m);
        }
        String cell = m + "," + n;
        if (map.containsKey(cell)) {
            return map.get(cell);
        }
        int l = uniquePaths(m, n - 1);
        int r = uniquePaths(m - 1, n);
        map.put(cell, l + r);
        return l + r;
    }

}
