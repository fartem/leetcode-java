package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/rotate-string/
public class RotateString {

    private final String a;
    private final String b;

    public RotateString(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public boolean solution() {
        return a.length() == b.length() && (a + a).contains(b);
    }

}
