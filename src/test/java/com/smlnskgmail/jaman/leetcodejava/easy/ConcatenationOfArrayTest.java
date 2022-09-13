package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConcatenationOfArrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{1, 2, 1, 1, 2, 1},
                new ConcatenationOfArray(new int[]{1, 2, 1}).solution()
        );
    }

}
