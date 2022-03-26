package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfLaserBeamsInABankTest {

    @Test
    public void defaultTest() {
        assertEquals(
                8,
                new NumberOfLaserBeamsInABank(
                        new String[]{"011001", "000000", "010100", "001000"}
                ).solution()
        );
    }

}
