package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromicSubstringsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new PalindromicSubstrings("abc").solution()
        );
    }

}
