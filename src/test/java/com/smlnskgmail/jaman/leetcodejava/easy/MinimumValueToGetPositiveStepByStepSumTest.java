package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumValueToGetPositiveStepByStepSumTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5,
                new MinimumValueToGetPositiveStepByStepSum(new int[] {-3, 2, -3, 4, 2}).solution());
    }
}
