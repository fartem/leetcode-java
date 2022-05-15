package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "bab",
                new LongestPalindromicSubstring("babad").solution()
        );
    }

}
