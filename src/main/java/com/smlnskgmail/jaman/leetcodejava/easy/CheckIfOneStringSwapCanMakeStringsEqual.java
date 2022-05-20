package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
public class CheckIfOneStringSwapCanMakeStringsEqual {

    private final String s1;
    private final String s2;

    public CheckIfOneStringSwapCanMakeStringsEqual(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public boolean solution() {
        char[] s1Chars = new char[128];
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            char s1Char = s1.charAt(i);
            if (s1Char != s2.charAt(i)) {
                diff++;
            }
            s1Chars[s1Char] = 1;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s1Chars[s2.charAt(i)] == 0) {
                return false;
            }
        }
        return diff == 0 || diff == 2;
    }

}
