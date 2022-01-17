package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CountingBitsTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(new int[] {0, 1, 1}, new CountingBits(2).solution());
    }
}
