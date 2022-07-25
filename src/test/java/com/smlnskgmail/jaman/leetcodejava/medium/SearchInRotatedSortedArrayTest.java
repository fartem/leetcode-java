package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInRotatedSortedArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new SearchInRotatedSortedArray(
                        new int[]{4, 5, 6, 7, 0, 1, 2},
                        0
                ).solution()
        );
    }

}
