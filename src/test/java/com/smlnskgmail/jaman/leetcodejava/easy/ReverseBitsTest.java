package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseBitsTest {

    @Test
    public void defaultTest() {
        assertEquals(964176192, new ReverseBits(0b00000010100101000001111010011100).solution());
    }
}
