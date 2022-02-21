package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FindAndReplacePatternTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList("mee", "aqq"),
                new FindAndReplacePattern(
                        new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"},
                        "abb"
                ).solution()
        );
    }

}
