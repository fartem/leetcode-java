package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.*;

// https://leetcode.com/problems/sort-characters-by-frequency/
public class SortCharactersByFrequency {

    private final String input;

    public SortCharactersByFrequency(String input) {
        this.input = input;
    }

    public String solution() {
        int[] chars = new int[128];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            chars[c] = chars[c] + 1;
        }
        Map<Integer, List<Character>> sortedChars = new TreeMap<>(
                Collections.reverseOrder()
        );
        for (int i = 0; i < chars.length; i++) {
            int count = chars[i];
            if (count != 0) {
                List<Character> characters;
                if (sortedChars.containsKey(count)) {
                    characters = sortedChars.get(count);
                    characters.add((char) i);
                } else {
                    characters = new ArrayList<>();
                    characters.add((char) i);
                }
                sortedChars.put(count, characters);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, List<Character>> sortedValue : sortedChars.entrySet()) {
            List<Character> characters = sortedValue.getValue();
            for (char c : characters) {
                result.append(String.valueOf(c).repeat(Math.max(0, sortedValue.getKey())));
            }
        }
        return result.toString();
    }

}
