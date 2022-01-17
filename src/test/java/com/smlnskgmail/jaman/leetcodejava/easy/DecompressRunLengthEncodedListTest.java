package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DecompressRunLengthEncodedListTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {2, 4, 4, 4},
                new DecompressRunLengthEncodedList(new int[] {1, 2, 3, 4}).solution());
    }
}
