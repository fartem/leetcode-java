package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/check-distances-between-same-letters/
public class CheckDistancesBetweenSameLetters {

    private final String s;
    private final int[] distance;

    public CheckDistancesBetweenSameLetters(String s, int[] distance) {
        this.s = s;
        this.distance = distance;
    }

    public boolean solution() {
        int[] letters = new int[26];
        Arrays.fill(letters, -1);
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 97;
            if (letters[c] == -1) {
                letters[c] = i;
            } else {
                letters[c] = i - letters[c] - 1;
            }
        }
        for (int i = 0; i < distance.length; i++) {
            int dist = distance[i];
            int let = letters[i];
            if (let != -1) {
                if (let != dist) {
                    return false;
                }
            }
        }
        return true;
    }

}
