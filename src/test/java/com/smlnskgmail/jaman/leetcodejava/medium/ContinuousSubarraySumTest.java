package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ContinuousSubarraySumTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new ContinuousSubarraySum(
                        new int[]{23, 2, 4, 6, 7},
                        6
                ).solution()
        );
    }

}
