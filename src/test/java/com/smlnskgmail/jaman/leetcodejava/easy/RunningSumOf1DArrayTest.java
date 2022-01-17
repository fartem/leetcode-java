package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RunningSumOf1DArrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {1, 3, 6, 10},
                new RunningSumOf1DArray(new int[] {1, 2, 3, 4}).solution());
    }
}
