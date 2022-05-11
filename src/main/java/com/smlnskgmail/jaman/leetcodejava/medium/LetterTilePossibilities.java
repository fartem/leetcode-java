package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/letter-tile-possibilities
public class LetterTilePossibilities {

    private final String tiles;
    private int count;

    public LetterTilePossibilities(String input) {
        this.tiles = input;
    }

    public int solution() {
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);
        backtrack(chars, new boolean[chars.length]);
        return count - 1;
    }

    private void backtrack(char[] chars, boolean[] used) {
        count += 1;
        for (int i = 0; i < chars.length; i++) {
            if (used[i] || i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            backtrack(chars, used);
            used[i] = false;
        }
    }

}
