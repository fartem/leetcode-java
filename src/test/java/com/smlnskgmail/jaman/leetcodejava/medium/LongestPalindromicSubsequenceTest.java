package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubsequenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new LongestPalindromicSubsequence("bbbab").solution()
        );
    }

}
