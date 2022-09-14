package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumAddToMakeParenthesesValidTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new MinimumAddToMakeParenthesesValid("())").solution()
        );
    }

}
