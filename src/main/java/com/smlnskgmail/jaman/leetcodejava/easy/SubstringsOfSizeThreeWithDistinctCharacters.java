package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
public class SubstringsOfSizeThreeWithDistinctCharacters {

    private final String input;

    public SubstringsOfSizeThreeWithDistinctCharacters(String input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            char first = input.charAt(i);
            char second = input.charAt(i + 1);
            char third = input.charAt(i + 2);
            if (first != second && second != third && first != third) {
                result++;
            }
        }
        return result;
    }

}
