package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters
public class NumberOfSubstringsContainingAllThreeCharacters {

    private final String s;

    public NumberOfSubstringsContainingAllThreeCharacters(String input) {
        this.s = input;
    }

    public int solution() {
        int[] characters = new int[3];
        int result = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            characters[s.charAt(i) - 'a']++;
            while (characters[0] > 0 && characters[1] > 0 && characters[2] > 0) {
                result += s.length() - i;
                characters[s.charAt(left++) - 'a']--;
            }
        }
        return result;
    }

}
