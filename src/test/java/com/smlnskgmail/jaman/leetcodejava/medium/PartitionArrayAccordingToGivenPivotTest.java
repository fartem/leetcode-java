package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PartitionArrayAccordingToGivenPivotTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{9, 5, 3, 10, 10, 12, 14},
                new PartitionArrayAccordingToGivenPivot(
                        new int[]{9, 12, 5, 10, 14, 3, 10},
                        10
                ).solution()
        );
    }

}
