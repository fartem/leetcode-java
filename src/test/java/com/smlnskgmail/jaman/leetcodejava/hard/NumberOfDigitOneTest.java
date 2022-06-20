package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfDigitOneTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new NumberOfDigitOne(13).solution()
        );
    }

}
