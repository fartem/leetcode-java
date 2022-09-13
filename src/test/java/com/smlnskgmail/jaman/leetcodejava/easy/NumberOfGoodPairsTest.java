package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfGoodPairsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new NumberOfGoodPairs(new int[]{1, 2, 3, 1, 1, 3}).solution()
        );
    }

}
