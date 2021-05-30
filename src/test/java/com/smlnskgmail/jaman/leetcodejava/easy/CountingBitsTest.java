package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CountingBitsTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{0, 1, 1},
                new CountingBits(2).solution()
        );
    }

}
