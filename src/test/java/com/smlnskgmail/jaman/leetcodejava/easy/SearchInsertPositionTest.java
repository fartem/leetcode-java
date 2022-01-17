package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInsertPositionTest {

    @Test
    public void defaultTest() {
        assertEquals(2, new SearchInsertPosition(new int[] {1, 3, 5, 6}, 5).solution());
    }
}
