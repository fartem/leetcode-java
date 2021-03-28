package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestSubstringBetweenTwoEqualCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                0,
                new LargestSubstringBetweenTwoEqualCharacters(
                        "aa"
                ).solution()
        );
    }

}
