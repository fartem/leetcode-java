package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromeByConcatenatingTwoLetterWordsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new LongestPalindromeByConcatenatingTwoLetterWords(
                        new String[]{"lc", "cl", "gg"}
                ).solution()
        );
    }

}
