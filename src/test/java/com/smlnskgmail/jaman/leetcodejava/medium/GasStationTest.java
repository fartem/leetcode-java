package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GasStationTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new GasStation(
                        new int[]{1, 2, 3, 4, 5},
                        new int[]{3, 4, 5, 1, 2}
                ).solution()
        );
    }

}
