package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfLastWordTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5,
                new LengthOfLastWord("Hello World").solution()
        );
    }

}
