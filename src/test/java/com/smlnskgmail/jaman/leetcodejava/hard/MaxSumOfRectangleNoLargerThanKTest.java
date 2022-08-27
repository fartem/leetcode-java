package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSumOfRectangleNoLargerThanKTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new MaxSumOfRectangleNoLargerThanK(
                        new int[][]{{1, 0, 1}, {0, -2, 3}},
                        2
                ).solution()
        );
    }

}
