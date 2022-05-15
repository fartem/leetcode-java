package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.NodeWithNeighbors;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CloneGraphTest {

    @Test
    public void defaultTest() {
        NodeWithNeighbors g1 = new NodeWithNeighbors(1);
        NodeWithNeighbors g2 = new NodeWithNeighbors(2);
        NodeWithNeighbors g3 = new NodeWithNeighbors(3);
        NodeWithNeighbors g4 = new NodeWithNeighbors(4);
        g1.neighbors.add(g2);
        g1.neighbors.add(g4);
        g2.neighbors.add(g1);
        g2.neighbors.add(g3);
        g3.neighbors.add(g2);
        g3.neighbors.add(g4);
        g4.neighbors.add(g1);
        g4.neighbors.add(g4);
        assertTrue(
                NodeWithNeighbors.areEquals(
                        g1,
                        new CloneGraph(g1).solution()
                )
        );
    }

}
