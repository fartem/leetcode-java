package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SumOfAbsoluteDifferencesInASortedArrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{4, 3, 5},
                new SumOfAbsoluteDifferencesInASortedArray(
                        new int[]{2, 3, 5}
                ).solution()
        );
    }

}
