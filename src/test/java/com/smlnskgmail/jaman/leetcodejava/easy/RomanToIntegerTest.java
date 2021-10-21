package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new RomanToInteger(
                        "III"
                ).solution()
        );
    }

}
