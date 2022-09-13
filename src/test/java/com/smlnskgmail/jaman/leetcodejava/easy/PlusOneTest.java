package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{1, 2, 4},
                new PlusOne(new int[]{1, 2, 3}).solution()
        );
    }

}
