package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NonOverlappingIntervalsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new NonOverlappingIntervals(
                        new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}
                ).solution()
        );
    }

}
