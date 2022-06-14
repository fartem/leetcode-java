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
        int count = 0;
        int[] indices = new int[2];
        int p = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) {
                    return false;
                }
                indices[p++] = i;
            }
        }
        return s1.charAt(indices[0]) == s2.charAt(indices[1]) && s1.charAt(indices[1]) == s2.charAt(indices[0]);
    }

}
