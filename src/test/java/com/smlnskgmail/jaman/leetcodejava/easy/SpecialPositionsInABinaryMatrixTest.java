package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialPositionsInABinaryMatrixTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new SpecialPositionsInABinaryMatrix(
                        new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0},}
                ).solution()
        );
    }

}
