package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class XORQueriesOfASubarrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 7, 14, 8},
                new XORQueriesOfASubarray(
                        new int[]{1, 3, 4, 8},
                        new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}}
                ).solution()
        );
    }

}
