package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfStringsThatAppearAsSubstringsInWordTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new NumberOfStringsThatAppearAsSubstringsInWord(
                        new String[]{"a", "abc", "bc", "d"},
                        "abc"
                ).solution()
        );
    }

}
