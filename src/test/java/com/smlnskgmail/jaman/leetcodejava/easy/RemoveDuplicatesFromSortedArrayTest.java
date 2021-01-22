package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new RemoveDuplicatesFromSortedArray(
                        new int[]{1, 1, 2}
                ).solution()
        );
    }

}
