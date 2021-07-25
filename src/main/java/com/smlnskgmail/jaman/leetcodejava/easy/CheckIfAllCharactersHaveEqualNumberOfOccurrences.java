package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences
public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    private final String input;

    public CheckIfAllCharactersHaveEqualNumberOfOccurrences(String input) {
        this.input = input;
    }

    public boolean solution() {
        int[] chars = new int[26];
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 97;
            chars[index] = chars[index] + 1;
        }
        int count = 0;
        for (int c : chars) {
            if (c != 0) {
                if (count == 0) {
                    count = c;
                } else if (count != c) {
                    return false;
                }
            }
        }
        return true;
    }

}
