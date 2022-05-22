package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
public class NumberOfSubstringsContainingAllThreeCharacters {

    private final String input;

    public NumberOfSubstringsContainingAllThreeCharacters(String input) {
        this.input = input;
    }

    public int solution() {
        int[] characters = new int[3];
        int result = 0;
        int left = 0;
        for (int i = 0; i < input.length(); i++) {
            characters[input.charAt(i) - 'a']++;
            while (characters[0] > 0 && characters[1] > 0 && characters[2] > 0) {
                result += input.length() - i;
                characters[input.charAt(left++) - 'a']--;
            }
        }
        return result;
    }

}
