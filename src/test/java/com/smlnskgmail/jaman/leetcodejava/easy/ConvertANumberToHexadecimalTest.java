package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertANumberToHexadecimalTest {

    @Test
    public void defaultTest() {
        assertEquals("1a", new ConvertANumberToHexadecimal(26).solution());
    }
}
