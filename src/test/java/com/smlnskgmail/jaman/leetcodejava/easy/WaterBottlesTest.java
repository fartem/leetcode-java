package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WaterBottlesTest {

    @Test
    public void defaultTest() {
        assertEquals(13, new WaterBottles(9, 3).solution());
    }
}
