package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReshapeTheMatrixTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[][]{{1, 2, 3, 4}},
                new ReshapeTheMatrix(
                        new int[][]{{1, 2}, {3, 4}},
                        1,
                        4
                ).solution()
        );
    }

}
