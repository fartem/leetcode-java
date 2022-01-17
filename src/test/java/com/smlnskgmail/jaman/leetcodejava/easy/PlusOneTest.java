package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PlusOneTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(new int[] {1, 2, 4}, new PlusOne(new int[] {1, 2, 3}).solution());
    }
}
