package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthLargestElementInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5,
                new KthLargestElementInAnArray(
                        new int[]{3, 2, 1, 5, 6, 4},
                        2
                ).solution()
        );
    }

}
