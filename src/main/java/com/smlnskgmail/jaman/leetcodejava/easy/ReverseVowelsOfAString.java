package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/reverse-vowels-of-a-string
public class ReverseVowelsOfAString {

    private final String input;

    public ReverseVowelsOfAString(String input) {
        this.input = input;
    }

    public String solution() {
        Set<Character> vowels = new HashSet<>(10);
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');

        char[] letters = input.toCharArray();
        int l = 0;
        int r = letters.length - 1;
        while (l < r) {
            char left = letters[l];
            if (!vowels.contains(left)) {
                l++;
                continue;
            }
            char right = letters[r];
            if (!vowels.contains(right)) {
                r--;
                continue;
            }
            letters[l] = right;
            letters[r] = left;
            l++;
            r--;
        }
        return String.valueOf(letters);
    }

}
