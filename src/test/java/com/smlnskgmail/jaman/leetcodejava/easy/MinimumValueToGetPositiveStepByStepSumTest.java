package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumValueToGetPositiveStepByStepSumTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5,
                new MinimumValueToGetPositiveStepByStepSum(
                        new int[]{-3, 2, -3, 4, 2}
                ).solution()
        );
    }

}
