package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SlidingWindowMaximumTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{3, 3, 5, 5, 6, 7},
                new SlidingWindowMaximum(
                        new int[]{1, 3, -1, -3, 5, 3, 6, 7},
                        3
                ).solution()
        );
    }

}
