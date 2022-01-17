package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumAscendingSubarraySumTest {

    @Test
    public void defaultTest() {
        assertEquals(
                65, new MaximumAscendingSubarraySum(new int[] {10, 20, 30, 5, 10, 50}).solution());
    }
}
