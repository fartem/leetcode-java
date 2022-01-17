package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram
public class CheckIfTheSentenceIsPangram {

    private final String input;

    public CheckIfTheSentenceIsPangram(String input) {
        this.input = input;
    }

    public boolean solution() {
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            letters.add(input.charAt(i));
        }
        return letters.size() == 26;
    }
}
