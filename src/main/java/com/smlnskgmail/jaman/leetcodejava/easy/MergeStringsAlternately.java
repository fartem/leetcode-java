package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/merge-strings-alternately
public class MergeStringsAlternately {

    private final String firstString;
    private final String secondString;

    public MergeStringsAlternately(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    public String solution() {
        char[] result = new char[firstString.length() + secondString.length()];
        int firstPointer = 0;
        int secondPointer = 0;
        for (int i = 0; i < result.length;) {
            if (firstString.length() > firstPointer) {
                result[i] = firstString.charAt(firstPointer);
                firstPointer++;
                i++;
            }
            if (secondString.length() > secondPointer) {
                result[i] = secondString.charAt(secondPointer);
                secondPointer++;
                i++;
            }
        }
        return String.valueOf(result);
    }

}
