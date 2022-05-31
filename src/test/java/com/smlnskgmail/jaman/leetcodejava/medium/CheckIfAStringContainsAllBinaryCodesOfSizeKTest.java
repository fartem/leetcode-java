package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfAStringContainsAllBinaryCodesOfSizeKTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfAStringContainsAllBinaryCodesOfSizeK(
                        "00110110",
                        2
                ).solution()
        );
    }

}
