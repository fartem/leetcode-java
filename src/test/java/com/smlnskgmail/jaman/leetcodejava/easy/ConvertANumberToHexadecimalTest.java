package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertANumberToHexadecimalTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "1a",
                new ConvertANumberToHexadecimal(26).solution()
        );
    }

}
