package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrencesTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfAllCharactersHaveEqualNumberOfOccurrences(
                        "abcabc"
                ).solution()
        );
    }

}
