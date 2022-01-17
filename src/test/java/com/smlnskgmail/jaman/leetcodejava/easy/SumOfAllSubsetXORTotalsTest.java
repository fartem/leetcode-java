package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfAllSubsetXORTotalsTest {

    @Test
    public void defaultTest() {
        assertEquals(6, new SumOfAllSubsetXORTotals(new int[] {1, 3}).solution());
    }
}
