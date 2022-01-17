package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CheckWhetherTwoStringsAreAlmostEquivalentTest {

    @Test
    public void defaultTest() {
        assertFalse(new CheckWhetherTwoStringsAreAlmostEquivalent("aaaa", "bccb").solution());
    }
}
