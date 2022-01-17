package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumAverageSubarrayITest {

    @Test
    public void defaultTest() {
        assertEquals(
                12.75000,
                new MaximumAverageSubarrayI(new int[] {1, 12, -5, -6, 50, 3}, 4).solution(),
                0);
    }
}
