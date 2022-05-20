package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/delete-characters-to-make-fancy-string/
public class DeleteCharactersToMakeFancyString {

    private final String input;

    public DeleteCharactersToMakeFancyString(String input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        char prev = input.charAt(0);
        int count = 1;
        result.append(prev);
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == prev) {
                count++;
            } else {
                count = 1;
                prev = c;
            }
            if (count < 3) {
                result.append(c);
            }
        }
        return result.toString();
    }

}
