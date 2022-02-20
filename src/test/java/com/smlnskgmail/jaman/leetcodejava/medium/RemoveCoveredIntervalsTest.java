package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveCoveredIntervalsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new RemoveCoveredIntervals(
                        new int[][]{{1, 4}, {3, 6}, {2, 8}}
                ).solution()
        );
    }

}
