package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOf1BitsTest {

    @Test
    public void defaultTest() {
        assertEquals(3, new NumberOf1Bits(0b00000000000000000000000000001011).solution());
    }
}
