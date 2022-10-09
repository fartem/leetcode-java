package com.smlnskgmail.jaman.leetcodejava.hard;

// https://leetcode.com/problems/regular-expression-matching/
public class RegularExpressionMatching {

    private final String s;
    private final String p;

    public RegularExpressionMatching(String s, String p) {
        this.s = s;
        this.p = p;
    }

    public boolean solution() {
        return isMatch(s, p);
    }

    private boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        boolean m = !s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || (m && isMatch(s.substring(1), p));
        }
        return m && isMatch(s.substring(1), p.substring(1));
    }

}
