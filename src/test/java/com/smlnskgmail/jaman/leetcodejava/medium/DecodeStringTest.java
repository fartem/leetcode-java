package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "aaabcbc",
                new DecodeString("3[a]2[bc]").solution()
        );
    }

}
