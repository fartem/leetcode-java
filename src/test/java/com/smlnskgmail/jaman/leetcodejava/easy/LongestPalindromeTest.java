package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestPalindromeTest {

    @Test
    public void defaultTest() {
        assertEquals(7, new LongestPalindrome("abccccdd").solution());
    }
}
