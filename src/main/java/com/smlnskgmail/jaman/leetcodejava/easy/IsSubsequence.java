package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/is-subsequence
public class IsSubsequence {

    private final String s;
    private final String t;

    public IsSubsequence(
            String s,
            String t
    ) {
        this.s = s;
        this.t = t;
    }

    public boolean solution() {
        int sPointer = 0;
        int tPointer = 0;
        while (sPointer != s.length() && tPointer != t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }
        return sPointer == s.length();
    }

}
