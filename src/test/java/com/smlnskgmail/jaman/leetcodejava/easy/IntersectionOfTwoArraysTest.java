package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class IntersectionOfTwoArraysTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {2},
                new IntersectionOfTwoArrays(new int[] {1, 2, 2, 1}, new int[] {2, 2}).solution());
    }
}
