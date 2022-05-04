package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxNumberOfKSumPairsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new MaxNumberOfKSumPairs(
                        new int[]{1, 2, 3, 4},
                        5
                ).solution()
        );
        assertEquals(
                1,
                new MaxNumberOfKSumPairs(
                        new int[]{3, 1, 3, 4, 3},
                        6
                ).solution()
        );
    }

}
