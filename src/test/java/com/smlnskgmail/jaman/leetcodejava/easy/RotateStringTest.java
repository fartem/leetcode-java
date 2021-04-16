package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RotateStringTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new RotateString(
                        "abcde",
                        "cdeab"
                ).solution()
        );
    }

}
