package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindCenterOfStarGraphTest {

    @Test
    public void defaultTest() {
        assertEquals(2, new FindCenterOfStarGraph(new int[][] {{1, 2}, {2, 3}, {4, 2}}).solution());
    }
}
