package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOf1BitsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new NumberOf1Bits(
                        0b00000000000000000000000000001011
                ).solution()
        );
    }

}
