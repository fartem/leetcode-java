package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PeakIndexInAMountainArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(1, new PeakIndexInAMountainArray(new int[] {0, 1, 0}).solution());
    }
}
