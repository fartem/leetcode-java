package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new BinarySearch(
                        new int[]{-1, 0, 3, 5, 9, 12},
                        9
                ).solution()
        );
    }

}
