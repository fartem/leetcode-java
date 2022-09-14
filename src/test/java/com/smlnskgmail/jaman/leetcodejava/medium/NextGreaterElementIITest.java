package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextGreaterElementIITest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, -1, 2},
                new NextGreaterElementII(new int[]{1, 2, 1}).solution()
        );
    }

}
