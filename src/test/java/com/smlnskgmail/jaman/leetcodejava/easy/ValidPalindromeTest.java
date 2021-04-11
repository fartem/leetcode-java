package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new ValidPalindrome(
                        "A man, a plan, a canal: Panama"
                ).solution()
        );
    }

}
