package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ElementAppearingMoreThan25InSortedArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new ElementAppearingMoreThan25InSortedArray(new int[] {1, 2, 2, 6, 6, 6, 6, 7, 10})
                        .solution());
    }
}
