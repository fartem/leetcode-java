package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/shortest-distance-to-a-character
public class ShortestDistanceToACharacter {

    private final String string;
    private final char character;

    public ShortestDistanceToACharacter(String string, char character) {
        this.string = string;
        this.character = character;
    }

    public int[] solution() {
        int[] result = new int[string.length()];
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                indexes.add(i);
            }
        }
        int pos = 0;
        for (int i = 0; i < string.length(); i++) {
            int index = indexes.get(pos);
            int first = Math.abs(index - i);
            if (pos + 1 < indexes.size()) {
                int secondIndex = indexes.get(pos + 1);
                int second = Math.abs(secondIndex - i);
                result[i] = Math.min(first, second);
                if (first > second) {
                    pos++;
                }
            } else {
                result[i] = first;
            }
        }
        return result;
    }
}
