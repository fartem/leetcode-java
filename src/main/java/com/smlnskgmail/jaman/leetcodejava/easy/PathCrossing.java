package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.*;

// https://leetcode.com/problems/path-crossing
public class PathCrossing {

    private final String path;

    public PathCrossing(String input) {
        this.path = input;
    }

    public boolean solution() {
        Map<Integer, Set<Integer>> store = new HashMap<>();
        store.put(0, new HashSet<>(List.of(0)));
        for (int i = 0, a = 0, b = 0; i < path.length(); i++) {
            char moveUnit = path.charAt(i);
            switch (moveUnit) {
                case 'N':
                    a++;
                    break;
                case 'S':
                    a--;
                    break;
                case 'E':
                    b++;
                    break;
                case 'W':
                    b--;
                    break;
            }
            var set = store.getOrDefault(a, new HashSet<>());
            if (set.contains(b)) {
                return true;
            } else {
                set.add(b);
                store.put(a, set);
            }
        }
        return false;
    }
}
