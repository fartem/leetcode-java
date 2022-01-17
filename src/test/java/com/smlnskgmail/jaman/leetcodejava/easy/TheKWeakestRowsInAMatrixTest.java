package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TheKWeakestRowsInAMatrixTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {2, 0, 3},
                new TheKWeakestRowsInAMatrix(
                                new int[][] {
                                    {1, 1, 0, 0, 0},
                                    {1, 1, 1, 1, 0},
                                    {1, 0, 0, 0, 0},
                                    {1, 1, 0, 0, 0},
                                    {1, 1, 1, 1, 1}
                                },
                                3)
                        .solution());
    }
}
