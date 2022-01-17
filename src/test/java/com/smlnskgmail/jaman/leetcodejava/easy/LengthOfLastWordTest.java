package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LengthOfLastWordTest {

    @Test
    public void defaultTest() {
        assertEquals(5, new LengthOfLastWord("Hello World").solution());
    }
}
