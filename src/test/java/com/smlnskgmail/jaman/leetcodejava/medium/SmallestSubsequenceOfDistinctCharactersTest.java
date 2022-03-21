package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestSubsequenceOfDistinctCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "abc",
                new SmallestSubsequenceOfDistinctCharacters(
                        "bcabc"
                ).solution()
        );
    }

}
