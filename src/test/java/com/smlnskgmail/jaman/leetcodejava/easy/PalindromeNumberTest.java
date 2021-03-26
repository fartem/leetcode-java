package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeNumberTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new PalindromeNumber(
                        121
                ).solution()
        );
    }

}
