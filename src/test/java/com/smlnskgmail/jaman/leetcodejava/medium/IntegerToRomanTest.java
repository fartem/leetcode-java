package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "III",
                new IntegerToRoman(3).solution()
        );
    }

}
