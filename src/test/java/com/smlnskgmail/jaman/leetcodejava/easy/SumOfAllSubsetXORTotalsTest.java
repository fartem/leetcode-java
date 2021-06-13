package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfAllSubsetXORTotalsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new SumOfAllSubsetXORTotals(
                        new int[]{1, 3}
                ).solution()
        );
    }

}
