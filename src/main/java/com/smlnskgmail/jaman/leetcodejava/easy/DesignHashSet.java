package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/design-hashset
public class DesignHashSet {

    private final Map<Integer, Object> table;

    public DesignHashSet() {
        table = new HashMap<>();
    }

    public void add(int key) {
        table.put(key, null);
    }

    public void remove(int key) {
        table.remove(key, null);
    }

    public boolean contains(int key) {
        return table.containsKey(key);
    }
}
