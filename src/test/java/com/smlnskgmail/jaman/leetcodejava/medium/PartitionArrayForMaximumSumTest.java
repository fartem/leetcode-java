package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartitionArrayForMaximumSumTest {

    @Test
    public void defaultTest() {
        assertEquals(
                84,
                new PartitionArrayForMaximumSum(
                        new int[]{1, 15, 7, 9, 2, 5, 10},
                        3
                ).solution()
        );
    }

}
