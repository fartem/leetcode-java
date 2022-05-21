package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistanceBetweenBusStopsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new DistanceBetweenBusStops(
                        new int[]{1, 2, 3, 4},
                        0,
                        1
                ).solution()
        );
    }

}
