package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
public class MinimumNumberOfVerticesToReachAllNodes {

    private final int n;
    private final List<List<Integer>> edges;

    public MinimumNumberOfVerticesToReachAllNodes(int n, List<List<Integer>> edges) {
        this.n = n;
        this.edges = edges;
    }

    public List<Integer> solution() {
        List<Integer> result = new ArrayList<>();
        int[] reachable = new int[n];
        for (List<Integer> edge : edges) {
            reachable[edge.get(1)] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (reachable[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }

}
