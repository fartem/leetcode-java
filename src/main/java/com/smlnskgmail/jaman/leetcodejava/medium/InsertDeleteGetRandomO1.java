package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.*;

// https://leetcode.com/problems/insert-delete-getrandom-o1/
public class InsertDeleteGetRandomO1 {

    private final Set<Integer> table = new HashSet<>();
    private final List<Integer> values = new ArrayList<>();
    private final Random random = new Random();

    public boolean insert(int val) {
        if (!table.contains(val)) {
            table.add(val);
            values.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (table.contains(val)) {
            table.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int size = values.size();
        int value = values.get(random.nextInt(size));
        while (!table.contains(value)) {
            value = values.get(random.nextInt(size));
        }
        return value;
    }

}
