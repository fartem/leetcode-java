package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingWordsWithAGivenPrefixTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new CountingWordsWithAGivenPrefix(
                        new String[]{"pay", "attention", "practice", "attend"},
                        "at"
                ).solution()
        );
    }

}
