package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/rings-and-rods/
public class RingsAndRods {

    private final String input;

    public RingsAndRods(String input) {
        this.input = input;
    }

    public int solution() {
        Map<Integer, Set<Character>> rods = new HashMap<>();
        for (int i = 0; i < input.length(); i += 2) {
            char ring = input.charAt(i);
            int pos = input.charAt(i + 1) - '0';
            Set<Character> rod = rods.get(pos);
            if (rod == null) {
                rod = new HashSet<>();
            }
            rod.add(ring);
            rods.put(pos, rod);
        }
        int result = 0;
        for (Map.Entry<Integer, Set<Character>> rod : rods.entrySet()) {
            if (rod.getValue().size() == 3) {
                result++;
            }
        }
        return result;
    }

}
