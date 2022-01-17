package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfGoodPairsTest {

    @Test
    public void defaultTest() {
        assertEquals(4, new NumberOfGoodPairs(new int[] {1, 2, 3, 1, 1, 3}).solution());
    }
}
