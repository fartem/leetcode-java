package com.smlnskgmail.jaman.leetcodejava.support;

import java.util.ArrayList;
import java.util.List;

public class NodeWithNeighbors {

    public int val;
    public List<NodeWithNeighbors> neighbors;

    public NodeWithNeighbors(int val) {
        this.val = val;
        this.neighbors = new ArrayList<>();
    }

    public NodeWithNeighbors(int val, List<NodeWithNeighbors> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }

    public static boolean areEquals(NodeWithNeighbors g1, NodeWithNeighbors g2) {
        if (g1 != null && g2 != null) {
            if (g1.val != g2.val) {
                return false;
            }
            if (g1.neighbors.size() != g2.neighbors.size()) {
                return false;
            }
            int p = 0;
            while (p < g1.neighbors.size()) {
                if (g1.neighbors.get(p).val != g2.neighbors.get(p).val) {
                    return false;
                }
                p++;
            }
            return true;
        }
        return g1 == null && g2 == null;
    }

}
