package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindTheHighestAltitudeTest {

    @Test
    public void defaultTest() {
        assertEquals(1, new FindTheHighestAltitude(new int[] {-5, 1, 5, 0, -7}).solution());
    }
}
