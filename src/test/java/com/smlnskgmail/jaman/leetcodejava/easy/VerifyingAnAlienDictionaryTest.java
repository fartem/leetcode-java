package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VerifyingAnAlienDictionaryTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new VerifyingAnAlienDictionary(
                                new String[] {"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz")
                        .solution());
        assertFalse(
                new VerifyingAnAlienDictionary(
                                new String[] {"apple", "app"}, "abcdefghijklmnopqrstuvwxyz")
                        .solution());
    }
}
