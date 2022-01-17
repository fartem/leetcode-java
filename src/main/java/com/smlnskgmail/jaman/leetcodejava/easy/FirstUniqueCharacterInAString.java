package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/first-unique-character-in-a-string
public class FirstUniqueCharacterInAString {

    private final String input;

    public FirstUniqueCharacterInAString(String input) {
        this.input = input;
    }

    public int solution() {
        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (chars.containsKey(c)) {
                chars.put(c, chars.get(c) + 1);
            } else {
                chars.put(c, 1);
            }
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (chars.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}
