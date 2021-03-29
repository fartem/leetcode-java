package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DetermineIfStringHalvesAreAlikeTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new DetermineIfStringHalvesAreAlike(
                        "book"
                ).solution()
        );
    }

}
