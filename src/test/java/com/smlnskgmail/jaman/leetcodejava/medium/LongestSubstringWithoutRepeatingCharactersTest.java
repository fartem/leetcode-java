package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void defaultTest() {
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters("abcabcbb").solution());
    }
}
