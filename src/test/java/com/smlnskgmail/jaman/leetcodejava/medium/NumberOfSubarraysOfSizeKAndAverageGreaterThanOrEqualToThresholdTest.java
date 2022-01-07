package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThresholdTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold(
                        new int[]{2, 2, 2, 2, 5, 5, 5, 8},
                        3,
                        4
                ).solution()
        );
    }

}
