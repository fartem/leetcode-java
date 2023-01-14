package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistinctSubsequencesTest {

    @Test
    public void defaultTests() {
        assertEquals(
                3,
                new DistinctSubsequences(
                        "rabbbit",
                        "rabbit"
                ).solution()
        );
        assertEquals(
                5,
                new DistinctSubsequences(
                        "babgbag",
                        "bag"
                ).solution()
        );
    }

}
