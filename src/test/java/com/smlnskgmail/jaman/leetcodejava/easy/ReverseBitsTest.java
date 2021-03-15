package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseBitsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                964176192,
                new ReverseBits(
                        0b00000010100101000001111010011100
                ).solution()
        );
    }

}
