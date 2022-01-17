package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RotateStringTest {

    @Test
    public void defaultTest() {
        assertTrue(new RotateString("abcde", "cdeab").solution());
    }
}
