package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumAddToMakeParenthesesValidTest {

    @Test
    public void defaultTest() {
        assertEquals(1, new MinimumAddToMakeParenthesesValid("())").solution());
    }
}
