package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DecompressRunLengthEncodedListTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 4, 4, 4},
                new DecompressRunLengthEncodedList(
                        new int[]{1, 2, 3, 4}
                ).solution()
        );
    }

}
