package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                7,
                new LongestPalindrome(
                        "abccccdd"
                ).solution()
        );
    }

}
