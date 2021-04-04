package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthMissingPositiveNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                9,
                new KthMissingPositiveNumber(
                        new int[]{2, 3, 4, 7, 11},
                        5
                ).solution()
        );
    }

}
