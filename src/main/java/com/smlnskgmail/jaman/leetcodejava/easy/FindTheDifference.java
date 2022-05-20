package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/find-the-difference/
public class FindTheDifference {

    private final String firstString;
    private final String secondString;

    public FindTheDifference(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    public char solution() {
        if (firstString.length() == 0) {
            return secondString.charAt(0);
        }
        char[] sChars = firstString.toCharArray();
        char[] tChars = secondString.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != tChars[i]) {
                return tChars[i];
            }
        }
        return tChars[tChars.length - 1];
    }

}
