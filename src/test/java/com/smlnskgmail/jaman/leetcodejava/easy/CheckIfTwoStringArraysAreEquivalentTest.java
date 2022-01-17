package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckIfTwoStringArraysAreEquivalentTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfTwoStringArraysAreEquivalent(
                                new String[] {"ab", "c"}, new String[] {"a", "bc"})
                        .solution());
    }
}
