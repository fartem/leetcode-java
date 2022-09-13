package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseVowelsOfAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "holle",
                new ReverseVowelsOfAString("hello").solution()
        );
    }

}
