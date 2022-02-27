package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/all-paths-from-source-to-target
public class AllPathsFromSourceToTarget {

    private final int[][] input;

    public AllPathsFromSourceToTarget(int[][] input) {
        this.input = input;
    }

    public List<List<Integer>> solution() {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        fillPaths(result, list, input, 0);
        return result;
    }

    private void fillPaths(
            List<List<Integer>> result,
            List<Integer> list,
            int[][] graph,
            int start
    ) {
        if (start == graph.length - 1) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = 0; i < graph[start].length; i++) {
                int curr = graph[start][i];
                list.add(curr);
                fillPaths(result, list, graph, curr);
                list.remove(list.size() - 1);
            }
        }
    }

}
