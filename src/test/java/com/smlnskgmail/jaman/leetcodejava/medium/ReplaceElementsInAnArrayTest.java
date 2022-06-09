package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReplaceElementsInAnArrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{3, 2, 7, 1},
                new ReplaceElementsInAnArray(
                        new int[]{1, 2, 4, 6},
                        new int[][]{{1, 3}, {4, 7}, {6, 1}}
                ).solution()
        );
    }

}
