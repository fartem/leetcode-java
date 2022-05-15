package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfSubstringsContainingAllThreeCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                10,
                new NumberOfSubstringsContainingAllThreeCharacters(
                        "abcabc"
                ).solution()
        );
    }

}
