package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{3, 4},
                new FindFirstAndLastPositionOfElementInSortedArray(
                        new int[]{5, 7, 7, 8, 8, 10},
                        8
                ).solution()
        );
        assertArrayEquals(
                new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray(
                        new int[]{},
                        3
                ).solution()
        );
    }

}
