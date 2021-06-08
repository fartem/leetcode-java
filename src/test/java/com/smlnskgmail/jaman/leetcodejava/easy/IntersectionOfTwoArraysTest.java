package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntersectionOfTwoArraysTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2},
                new IntersectionOfTwoArrays(
                        new int[]{1, 2, 2, 1},
                        new int[]{2, 2}
                ).solution()
        );
    }

}
