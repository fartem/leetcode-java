package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReplaceAllDigitsWithCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals("abcdef", new ReplaceAllDigitsWithCharacters("a1c1e1").solution());
    }
}
