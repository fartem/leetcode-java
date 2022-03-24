package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumUnitsOnATruckTest {

    @Test
    public void defaultTest() {
        assertEquals(
                8,
                new MaximumUnitsOnATruck(
                        new int[][]{{1, 3}, {2, 2}, {3, 1}},
                        4
                ).solution()
        );
        assertEquals(
                91,
                new MaximumUnitsOnATruck(
                        new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}},
                        10
                ).solution()
        );
    }

}
