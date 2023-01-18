package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/best-poker-hand/
public class BestPokerHand {

    private final int[] ranks;
    private final char[] suits;

    public BestPokerHand(int[] ranks, char[] suits) {
        this.ranks = ranks;
        this.suits = suits;
    }

    public String solution() {
        Set<Character> s = new HashSet<>();
        for (char suit : suits) {
            s.add(suit);
        }
        if (s.size() == 1) {
            return "Flush";
        }
        int[] r = new int[14];
        int max = 0;
        for (int rank : ranks) {
            r[rank]++;
            max = Math.max(max, r[rank]);
        }
        return max >= 3 ? "Three of a Kind" : max == 2 ? "Pair" : "High Card";
    }

}
