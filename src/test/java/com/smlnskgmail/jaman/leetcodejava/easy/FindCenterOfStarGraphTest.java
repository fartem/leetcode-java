package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindCenterOfStarGraphTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new FindCenterOfStarGraph(
                        new int[][]{{1, 2}, {2, 3}, {4, 2}}
                ).solution()
        );
    }

}
