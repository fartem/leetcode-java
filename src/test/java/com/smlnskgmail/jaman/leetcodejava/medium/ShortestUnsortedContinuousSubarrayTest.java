package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestUnsortedContinuousSubarrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5,
                new ShortestUnsortedContinuousSubarray(
                        new int[]{2, 6, 4, 8, 10, 9, 15}
                ).solution()
        );
    }

}
