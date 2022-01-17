package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Convert1DArrayInto2DArrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[][] {{1, 2}, {3, 4}},
                new Convert1DArrayInto2DArray(new int[] {1, 2, 3, 4}, 2, 2).solution());
    }
}
