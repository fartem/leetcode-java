package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/keys-and-rooms/
public class KeysAndRooms {

    private final List<List<Integer>> input;

    public KeysAndRooms(List<List<Integer>> input) {
        this.input = input;
    }

    public boolean solution() {
        boolean[] seen = new boolean[input.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            for (int next : input.get(node)) {
                if (!seen[next]) {
                    seen[next] = true;
                    stack.push(next);
                }
            }
        }
        for (boolean s : seen) {
            if (!s) {
                return false;
            }
        }
        return true;
    }

}
