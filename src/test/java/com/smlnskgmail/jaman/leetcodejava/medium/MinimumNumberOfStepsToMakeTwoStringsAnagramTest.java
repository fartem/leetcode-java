package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumNumberOfStepsToMakeTwoStringsAnagramTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new MinimumNumberOfStepsToMakeTwoStringsAnagram(
                        "bab",
                        "aba"
                ).solution()
        );
    }

}
