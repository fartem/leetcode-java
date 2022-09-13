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
    }

}
