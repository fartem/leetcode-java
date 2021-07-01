package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts
public class GenerateAStringWithCharactersThatHaveOddCounts {

    private final int input;

    public GenerateAStringWithCharactersThatHaveOddCounts(int input) {
        this.input = input;
    }

    public String solution() {
        return input % 2 == 0 ? "a".repeat(input - 1) + "b" : "a".repeat(input);
    }

}
