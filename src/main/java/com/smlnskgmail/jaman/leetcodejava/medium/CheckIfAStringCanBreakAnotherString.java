package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/check-if-a-string-can-break-another-string/
public class CheckIfAStringCanBreakAnotherString {

    private final String s1;
    private final String s2;

    public CheckIfAStringCanBreakAnotherString(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public boolean solution() {
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        boolean isAsc = true;
        boolean isDesc = true;
        for (int i = 0; i < c1.length; i++) {
            char f = c1[i];
            char s = c2[i];
            if (f < s) {
                isDesc = false;
            } else if (f > s) {
                isAsc = false;
            }
        }
        return isAsc || isDesc;
    }

}
