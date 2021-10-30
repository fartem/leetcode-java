package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Convert1DArrayInto2DArrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[][]{{1, 2}, {3, 4}},
                new Convert1DArrayInto2DArray(
                        new int[]{1, 2, 3, 4},
                        2,
                        2
                ).solution()
        );
    }

}
