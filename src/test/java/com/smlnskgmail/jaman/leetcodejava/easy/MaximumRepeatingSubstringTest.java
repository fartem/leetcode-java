package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumRepeatingSubstringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new MaximumRepeatingSubstring(
                        "ababc",
                        "ab"
                ).solution()
        );
        assertEquals(
                3,
                new MaximumRepeatingSubstring(
                        "aaa",
                        "a"
                ).solution()
        );
        assertEquals(
                1,
                new MaximumRepeatingSubstring(
                        "a",
                        "a"
                ).solution()
        );
        assertEquals(
                5,
                new MaximumRepeatingSubstring(
                        "aaabaaaabaaabaaaabaaaabaaaabaaaaba",
                        "aaaba"
                ).solution()
        );
        assertEquals(
                1,
                new MaximumRepeatingSubstring(
                        "bbba",
                        "a"
                ).solution()
        );
    }

}
