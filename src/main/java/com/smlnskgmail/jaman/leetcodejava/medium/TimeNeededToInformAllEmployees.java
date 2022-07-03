package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/time-needed-to-inform-all-employees/
public class TimeNeededToInformAllEmployees {

    private final int n;
    private final int headID;
    private final int[] manager;
    private final int[] informTime;

    public TimeNeededToInformAllEmployees(
            int n,
            int headID,
            int[] manager,
            int[] informTime
    ) {
        this.n = n;
        this.headID = headID;
        this.manager = manager;
        this.informTime = informTime;
    }

    public int solution() {
        Graph graph = new Graph(manager, n);
        return graph.getNumsOfMinutes(headID, informTime);
    }

    static class Graph {

        List<List<Integer>> list;
        int nodes;

        Graph(int[] manager, int nodes) {
            list = new ArrayList<>();
            this.nodes = nodes;

            for (int node = 0; node < nodes; node++) {
                list.add(new LinkedList<>());
            }

            for (int reportee = 0; reportee < nodes; reportee++) {
                int r = manager[reportee];
                if (r == -1) {
                    continue;
                }
                list.get(r).add(reportee);
            }
        }

        public int getNumsOfMinutes(int nodeId, int[] informTime) {
            int result = 0;
            for (int node : list.get(nodeId)) {
                result = Math.max(
                        result,
                        informTime[nodeId] + getNumsOfMinutes(node, informTime)
                );
            }
            return result;
        }

    }

}
