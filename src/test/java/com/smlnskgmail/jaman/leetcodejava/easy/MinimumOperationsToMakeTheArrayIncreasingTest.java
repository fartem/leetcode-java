package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumOperationsToMakeTheArrayIncreasingTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new MinimumOperationsToMakeTheArrayIncreasing(
                        new int[]{1, 1, 1}
                ).solution()
        );
    }

}
