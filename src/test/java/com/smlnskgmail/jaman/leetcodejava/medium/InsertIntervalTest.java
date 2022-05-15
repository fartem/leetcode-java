package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertIntervalTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[][]{{1, 5}, {6, 9}},
                new InsertInterval(
                        new int[][]{{1, 3}, {6, 9}},
                        new int[]{2, 5}
                ).solution()
        );
    }

}
