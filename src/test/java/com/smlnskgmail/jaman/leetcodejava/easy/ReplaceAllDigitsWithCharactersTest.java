package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceAllDigitsWithCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "abcdef",
                new ReplaceAllDigitsWithCharacters(
                        "a1c1e1"
                ).solution()
        );
    }

}
