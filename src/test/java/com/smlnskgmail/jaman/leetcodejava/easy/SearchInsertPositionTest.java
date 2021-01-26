package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new SearchInsertPosition(
                        new int[]{1, 3, 5, 6},
                        5
                ).solution()
        );
    }

}
