package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/first-bad-version
public class FirstBadVersion {

    private final int input;
    private int badVersion = Integer.MIN_VALUE;

    public FirstBadVersion(int input) {
        this.input = input;
    }

    public int solution() {
        int l = 1;
        int r = input;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (!isBadVersion(m)) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    private boolean isBadVersion(int version) {
        if (badVersion == Integer.MIN_VALUE) {
            badVersion = version;
            return false;
        }
        return true;
    }
}
