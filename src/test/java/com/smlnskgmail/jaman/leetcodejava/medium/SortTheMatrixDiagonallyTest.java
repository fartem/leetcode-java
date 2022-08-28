package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTheMatrixDiagonallyTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[][]{{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}},
                new SortTheMatrixDiagonally(
                        new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}}
                ).solution()
        );
    }

}
