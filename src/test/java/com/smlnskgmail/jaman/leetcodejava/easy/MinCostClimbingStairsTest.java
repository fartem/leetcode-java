package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinCostClimbingStairsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                15,
                new MinCostClimbingStairs(new int[]{10, 15, 20}).solution()
        );
    }

}
