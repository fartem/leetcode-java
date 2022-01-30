package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RearrangeArrayElementsBySignTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{3, -2, 1, -5, 2, -4},
                new RearrangeArrayElementsBySign(
                        new int[]{3, 1, -2, -5, 2, -4}
                ).solution()
        );
    }

}
