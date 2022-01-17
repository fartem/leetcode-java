package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumSubarrayTest {

    @Test
    public void defaultTest() {
        assertEquals(6, new MaximumSubarray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}).solution());
    }
}
