package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheHighestAltitudeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new FindTheHighestAltitude(
                        new int[]{-5, 1, 5, 0, -7}
                ).solution()
        );
    }

}
