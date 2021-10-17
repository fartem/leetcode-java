package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new LongestSubstringWithoutRepeatingCharacters(
                        "abcabcbb"
                ).solution()
        );
    }

}
