package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumTimeVisitingAllPointsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                7,
                new MinimumTimeVisitingAllPoints(
                        new int[][]{{1, 1}, {3, 4}, {-1, 0}}
                ).solution()
        );
    }

}
