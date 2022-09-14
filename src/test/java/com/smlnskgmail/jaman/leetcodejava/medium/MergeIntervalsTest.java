package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeIntervalsTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[][]{{1, 6}, {8, 10}, {15, 18}},
                new MergeIntervals(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}).solution()
        );
    }

}
