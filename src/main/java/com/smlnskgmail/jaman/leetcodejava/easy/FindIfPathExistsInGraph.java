package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/find-if-path-exists-in-graph/
public class FindIfPathExistsInGraph {

    private final int n;
    private final int[][] edges;
    private final int source;
    private final int destination;

    public FindIfPathExistsInGraph(
            int n,
            int[][] edges,
            int source,
            int destination
    ) {
        this.n = n;
        this.edges = edges;
        this.source = source;
        this.destination = destination;
    }

    public boolean solution() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            List<Integer> lA = graph.getOrDefault(a, new ArrayList<>());
            lA.add(b);
            graph.put(a, lA);
            List<Integer> lB = graph.getOrDefault(b, new ArrayList<>());
            lB.add(a);
            graph.put(b, lB);
        }
        boolean[] visited = new boolean[n];
        return dfs(graph, visited, source, destination);
    }

    private boolean dfs(
            Map<Integer, List<Integer>> graph,
            boolean[] visited,
            int source,
            int destination
    ) {
        if (visited[source]) {
            return false;
        }
        if (source == destination) {
            return true;
        }
        visited[source] = true;
        for (int neighbour : graph.get(source)) {
            if (dfs(graph, visited, neighbour, destination)) {
                return true;
            }
        }
        return false;
    }

}
