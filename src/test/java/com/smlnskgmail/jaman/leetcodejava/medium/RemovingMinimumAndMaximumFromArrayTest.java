package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemovingMinimumAndMaximumFromArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5,
                new RemovingMinimumAndMaximumFromArray(
                        new int[]{2, 10, 7, 5, 4, 1, 8, 6}
                ).solution()
        );
    }

}
