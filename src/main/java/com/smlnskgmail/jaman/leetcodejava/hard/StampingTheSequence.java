package com.smlnskgmail.jaman.leetcodejava.hard;

import java.util.*;

// https://leetcode.com/problems/stamping-the-sequence/
public class StampingTheSequence {

    private final String stamp;
    private final String target;

    public StampingTheSequence(String stamp, String target) {
        this.stamp = stamp;
        this.target = target;
    }

    public int[] solution() {
        int m = stamp.length();
        int n = target.length();
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] done = new boolean[n];
        Stack<Integer> s = new Stack<>();
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i <= n - m; i++) {
            var made = new HashSet<Integer>();
            var todo = new HashSet<Integer>();
            for (int j = 0; j < m; j++) {
                int res = i + j;
                if (target.charAt(res) == stamp.charAt(j)) {
                    made.add(res);
                } else {
                    todo.add(res);
                }
            }
            nodes.add(new Node(made, todo));
            if (todo.isEmpty()) {
                s.push(i);
                for (int j = i; j < i + m; j++) {
                    if (!done[j]) {
                        q.add(j);
                        done[j] = true;
                    }
                }
            }
        }
        while (!q.isEmpty()) {
            int i = q.poll();
            for (int j = Math.max(0, i - m + 1); j <= Math.min(n - m, i); j++) {
                var todo = nodes.get(j).todo;
                if (todo.contains(i)) {
                    todo.remove(i);
                    if (todo.isEmpty()) {
                        s.push(j);
                        for (int made : nodes.get(j).made) {
                            if (!done[made]) {
                                q.add(made);
                                done[made] = true;
                            }
                        }
                    }
                }
            }
        }
        for (boolean b : done) {
            if (!b) {
                return new int[0];
            }
        }
        int[] result = new int[s.size()];
        int pos = 0;
        while (!s.isEmpty()) {
            result[pos++] = s.pop();
        }
        return result;
    }

    static class Node {

        Set<Integer> made;
        Set<Integer> todo;

        Node(Set<Integer> made, Set<Integer> todo) {
            this.made = made;
            this.todo = todo;
        }

    }

}
