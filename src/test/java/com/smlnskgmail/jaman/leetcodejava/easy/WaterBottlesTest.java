package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottlesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                13,
                new WaterBottles(9, 3).solution()
        );
    }

}
