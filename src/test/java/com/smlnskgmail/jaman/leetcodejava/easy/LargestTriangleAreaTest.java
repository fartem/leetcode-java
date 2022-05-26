package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestTriangleAreaTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2.00000,
                new LargestTriangleArea(
                        new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}
                ).solution(),
                0
        );
    }

}
