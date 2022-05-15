package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.NodeWithNeighbors;

import java.util.HashMap;
import java.util.Map;

// https://www.youtube.com/watch?v=y5u74DCEnBc
public class CloneGraph {

    private final NodeWithNeighbors input;

    public CloneGraph(NodeWithNeighbors input) {
        this.input = input;
    }

    public NodeWithNeighbors solution() {
        return cloneGraph(input, new HashMap<>());
    }

    private NodeWithNeighbors cloneGraph(
            NodeWithNeighbors node,
            Map<NodeWithNeighbors, NodeWithNeighbors> values
    ) {
        if (node != null) {
            if (values.containsKey(node)) {
                return values.get(node);
            }
            NodeWithNeighbors root = new NodeWithNeighbors(node.val);
            values.put(node, root);
            for (NodeWithNeighbors neighbor : node.neighbors) {
                root.neighbors.add(cloneGraph(neighbor, values));
            }
            return root;
        }
        return null;
    }

}
