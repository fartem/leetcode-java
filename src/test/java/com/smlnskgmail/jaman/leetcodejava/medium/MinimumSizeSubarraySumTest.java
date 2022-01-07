package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSizeSubarraySumTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new MinimumSizeSubarraySum(
                        7,
                        new int[]{2, 3, 1, 2, 4, 3}
                ).solution()
        );
    }

}
