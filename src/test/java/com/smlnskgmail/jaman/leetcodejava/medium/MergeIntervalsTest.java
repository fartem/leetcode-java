package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeIntervalsTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[][]{{1, 6}, {8, 10}, {15, 18}},
                new MergeIntervals(
                        new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}
                ).solution()
        );
        assertArrayEquals(
                new int[][]{{1, 5}},
                new MergeIntervals(
                        new int[][]{{1, 4}, {4, 5}}
                ).solution()
        );
        assertArrayEquals(
                new int[][]{{0, 0}, {1, 4}},
                new MergeIntervals(
                        new int[][]{{1, 4}, {0, 0}}
                ).solution()
        );
        assertArrayEquals(
                new int[][]{{1, 10}},
                new MergeIntervals(
                        new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}}
                ).solution()
        );
    }

}
