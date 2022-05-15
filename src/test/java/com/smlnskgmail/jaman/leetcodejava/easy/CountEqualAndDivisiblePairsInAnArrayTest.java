package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountEqualAndDivisiblePairsInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new CountEqualAndDivisiblePairsInAnArray(
                        new int[]{3, 1, 2, 2, 2, 1, 3},
                        2
                ).solution()
        );
    }

}
