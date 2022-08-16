package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqueCharacterInAString {

    private final String input;

    public FirstUniqueCharacterInAString(String input) {
        this.input = input;
    }

    public int solution() {
        int[] chars = new int[128];
        for (int i = 0; i < input.length(); i++) {
            chars[input.charAt(i)]++;
        }
        for (int i = 0; i < input.length(); i++) {
            if (chars[input.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

}
