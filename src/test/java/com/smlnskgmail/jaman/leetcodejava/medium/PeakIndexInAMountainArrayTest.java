package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeakIndexInAMountainArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new PeakIndexInAMountainArray(new int[]{0, 1, 0}).solution()
        );
    }

}
