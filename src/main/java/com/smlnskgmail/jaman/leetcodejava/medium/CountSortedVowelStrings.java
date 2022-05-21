package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/count-sorted-vowel-strings/
public class CountSortedVowelStrings {

    private final int input;

    public CountSortedVowelStrings(int input) {
        this.input = input;
    }

    public int solution() {
        return (input + 4) * (input + 3) * (input + 2) * (input + 1) / 24;
    }

}
