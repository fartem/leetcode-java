package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MinimumNumberOfVerticesToReachAllNodesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(0, 3),
                new MinimumNumberOfVerticesToReachAllNodes(
                        6,
                        List.of(List.of(0, 1), List.of(0, 2), List.of(2, 5), List.of(3, 4), List.of(4, 2))
                ).solution()
        );
    }

}
