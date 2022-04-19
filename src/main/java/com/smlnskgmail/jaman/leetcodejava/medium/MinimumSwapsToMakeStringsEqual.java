package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/minimum-swaps-to-make-strings-equal
public class MinimumSwapsToMakeStringsEqual {

    private final String s1;
    private final String s2;

    public MinimumSwapsToMakeStringsEqual(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public int solution() {
        int x = 0;
        int y = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) == 'x') {
                    x++;
                } else {
                    y++;
                }
            }
        }
        int xC = x % 2;
        int yC = y % 2;
        if (xC == 0 && yC == 0) {
            return (x + y) / 2;
        } else if (xC == 1 && yC == 1) {
            return (x + y) / 2 + 1;
        }
        return -1;
    }

}
