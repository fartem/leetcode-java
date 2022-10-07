package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/decoded-string-at-index/
public class DecodedStringAtIndex {

    private final String s;
    private int k;

    public DecodedStringAtIndex(String s, int k) {
        this.s = s;
        this.k = k;
    }

    public String solution() {
        long size = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                size *= c - '0';
            } else {
                size++;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            k %= size;
            if (k == 0 && Character.isLetter(c)) {
                return Character.toString(c);
            }
            if (Character.isDigit(c)) {
                size /= c - '0';
            } else {
                size--;
            }
        }
        throw null;
    }

}
