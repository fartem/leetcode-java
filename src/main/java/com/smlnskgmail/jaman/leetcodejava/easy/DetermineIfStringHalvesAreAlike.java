package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/determine-if-string-halves-are-alike
public class DetermineIfStringHalvesAreAlike {

    private final String input;

    public DetermineIfStringHalvesAreAlike(String input) {
        this.input = input;
    }

    public boolean solution() {
        int middle = input.length() / 2;
        int vowels = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowels += i < middle ? 1 : -1;
                    break;
            }
        }
        return vowels == 0;
    }
}
