package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumTimeVisitingAllPointsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                7,
                new MinimumTimeVisitingAllPoints(new int[][] {{1, 1}, {3, 4}, {-1, 0}}).solution());
    }
}
