package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(2, new RemoveDuplicatesFromSortedArray(new int[] {1, 1, 2}).solution());
    }
}
