package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountNumberOfPairsWithAbsoluteDifferenceKTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new CountNumberOfPairsWithAbsoluteDifferenceK(new int[] {1, 2, 2, 1}, 1)
                        .solution());
    }
}
