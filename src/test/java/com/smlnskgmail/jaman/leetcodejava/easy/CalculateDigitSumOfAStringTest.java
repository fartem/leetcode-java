package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateDigitSumOfAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "135",
                new CalculateDigitSumOfAString(
                        "11111222223",
                        3
                ).solution()
        );
    }

}
