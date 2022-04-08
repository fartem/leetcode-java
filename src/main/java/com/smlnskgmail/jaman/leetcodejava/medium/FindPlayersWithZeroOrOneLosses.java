package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.*;

// https://leetcode.com/problems/find-players-with-zero-or-one-losses
public class FindPlayersWithZeroOrOneLosses {

    private final int[][] input;

    public FindPlayersWithZeroOrOneLosses(int[][] input) {
        this.input = input;
    }

    public List<List<Integer>> solution() {
        Set<Integer> zeros = new HashSet<>();
        Set<Integer> ones = new HashSet<>();
        Set<Integer> marks = new HashSet<>();
        for (int[] match : input) {
            int w = match[0];
            if (!marks.contains(w)) {
                zeros.add(w);
            }
            int l = match[1];
            if (!marks.contains(l)) {
                ones.add(l);
                marks.add(l);
            } else {
                ones.remove(l);
            }
            zeros.remove(l);
        }
        List<Integer> withoutLost = new ArrayList<>(zeros);
        List<Integer> withOneLost = new ArrayList<>(ones);
        Collections.sort(withoutLost);
        Collections.sort(withOneLost);
        return List.of(withoutLost, withOneLost);
    }

}
