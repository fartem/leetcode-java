package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumberOfLinesToWriteStringTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{3, 60},
                new NumberOfLinesToWriteString(
                        new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                        "abcdefghijklmnopqrstuvwxyz"
                ).solution()
        );
    }

}
