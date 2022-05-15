package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/map-sum-pairs
public class MapSumPairs {

    private final Node root = new Node();
    private final Map<String, Integer> values = new HashMap<>();

    public MapSumPairs() {

    }

    public void insert(String key, int val) {
        int delta = val - values.getOrDefault(key, 0);
        values.put(key, val);
        Node curr = root;
        curr.score += delta;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            curr.children.putIfAbsent(c, new Node());
            curr = curr.children.get(c);
            curr.score += delta;
        }
    }

    public int sum(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            curr = curr.children.get(c);
            if (curr == null) {
                return 0;
            }
        }
        return curr.score;
    }

    private static class Node {

        private final Map<Character, Node> children = new HashMap<>();
        int score;

    }

}
