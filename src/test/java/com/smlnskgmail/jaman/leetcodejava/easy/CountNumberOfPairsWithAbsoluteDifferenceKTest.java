package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountNumberOfPairsWithAbsoluteDifferenceKTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new CountNumberOfPairsWithAbsoluteDifferenceK(
                        new int[]{1, 2, 2, 1},
                        1
                ).solution()
        );
    }

}
