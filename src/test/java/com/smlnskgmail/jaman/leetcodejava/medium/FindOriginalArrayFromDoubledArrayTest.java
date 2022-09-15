package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindOriginalArrayFromDoubledArrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{1, 3, 4},
                new FindOriginalArrayFromDoubledArray(
                        new int[]{1, 3, 4, 2, 6, 8}
                ).solution()
        );
    }

}
