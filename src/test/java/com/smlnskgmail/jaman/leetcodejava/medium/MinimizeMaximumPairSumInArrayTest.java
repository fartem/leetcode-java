package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimizeMaximumPairSumInArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                7,
                new MinimizeMaximumPairSumInArray(
                        new int[]{3, 5, 2, 3}
                ).solution()
        );
    }

}
