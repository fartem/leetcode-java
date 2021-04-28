package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubarrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new MaximumSubarray(
                        new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}
                ).solution()
        );
    }

}
