package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumOperationsToMakeTheArrayIncreasingTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3, new MinimumOperationsToMakeTheArrayIncreasing(new int[] {1, 1, 1}).solution());
    }
}
