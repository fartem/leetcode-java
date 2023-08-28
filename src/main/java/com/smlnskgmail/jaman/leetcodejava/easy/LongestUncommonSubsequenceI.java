package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/longest-uncommon-subsequence-i/
public class LongestUncommonSubsequenceI {

    private final String a;
    private final String b;

    public LongestUncommonSubsequenceI(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public int solution() {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }

}
