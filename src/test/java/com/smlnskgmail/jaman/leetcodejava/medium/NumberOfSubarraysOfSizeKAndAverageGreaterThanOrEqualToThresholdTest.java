package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThresholdTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold(
                                new int[] {2, 2, 2, 2, 5, 5, 5, 8}, 3, 4)
                        .solution());
    }
}
