package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidAnagramTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new ValidAnagram(
                        "anagram",
                        "nagaram"
                ).solution()
        );
    }

}
