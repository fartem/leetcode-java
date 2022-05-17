package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountPrefixesOfAGivenStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new CountPrefixesOfAGivenString(
                        new String[]{"a", "b", "c", "ab", "bc", "abc"},
                        "abc"
                ).solution()
        );
    }

}
