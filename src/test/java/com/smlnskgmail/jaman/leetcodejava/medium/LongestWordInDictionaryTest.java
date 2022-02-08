package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestWordInDictionaryTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "world",
                new LongestWordInDictionary(
                        new String[]{"w", "wo", "wor", "worl", "world"}
                ).solution()
        );
    }

}
