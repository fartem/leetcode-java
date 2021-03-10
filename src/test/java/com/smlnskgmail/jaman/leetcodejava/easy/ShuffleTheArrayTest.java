package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ShuffleTheArrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 3, 5, 4, 1, 7},
                new ShuffleTheArray(
                        new int[]{2, 5, 1, 3, 4, 7},
                        3
                ).solution()
        );
    }

}
