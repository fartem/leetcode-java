package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidAnagramTest {

    @Test
    public void defaultTest() {
        assertTrue(new ValidAnagram("anagram", "nagaram").solution());
    }
}
