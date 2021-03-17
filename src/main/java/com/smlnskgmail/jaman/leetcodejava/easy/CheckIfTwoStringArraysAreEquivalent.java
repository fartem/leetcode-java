package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent
public class CheckIfTwoStringArraysAreEquivalent {

    private final String[] firstWordArray;
    private final String[] secondWordArray;

    public CheckIfTwoStringArraysAreEquivalent(
            String[] firstWordArray,
            String[] secondWordArray
    ) {
        this.firstWordArray = firstWordArray;
        this.secondWordArray = secondWordArray;
    }

    public boolean solution() {
        StringBuilder firstWord = new StringBuilder();
        for (String s : firstWordArray) {
            firstWord.append(s);
        }
        StringBuilder secondWord = new StringBuilder();
        for (String s : secondWordArray) {
            secondWord.append(s);
        }
        return firstWord.toString().equals(secondWord.toString());
    }

}
