package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumNumberOfRefuelingStopsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                0,
                new MinimumNumberOfRefuelingStops(1, 1, new int[][]{}).solution()
        );
    }

}
