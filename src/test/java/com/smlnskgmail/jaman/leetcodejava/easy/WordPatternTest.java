package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordPatternTest {

    @Test
    public void defaultTest() {
        assertTrue(new WordPattern("abba", "dog cat cat dog").solution());
    }
}
