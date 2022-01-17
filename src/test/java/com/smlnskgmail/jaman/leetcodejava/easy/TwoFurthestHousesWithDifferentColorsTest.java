package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoFurthestHousesWithDifferentColorsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new TwoFurthestHousesWithDifferentColors(new int[] {1, 1, 1, 6, 1, 1, 1})
                        .solution());
    }
}
