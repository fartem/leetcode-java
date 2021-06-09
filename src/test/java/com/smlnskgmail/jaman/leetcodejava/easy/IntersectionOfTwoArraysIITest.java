package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntersectionOfTwoArraysIITest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 2},
                new IntersectionOfTwoArraysII(
                        new int[]{1, 2, 2, 1},
                        new int[]{2, 2}
                ).solution()
        );
    }

}
