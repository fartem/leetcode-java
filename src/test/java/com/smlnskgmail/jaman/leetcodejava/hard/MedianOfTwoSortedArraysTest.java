package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2.0000,
                new MedianOfTwoSortedArrays(
                        new int[]{1, 3},
                        new int[]{2}
                ).solution(),
                0
        );
    }

}
