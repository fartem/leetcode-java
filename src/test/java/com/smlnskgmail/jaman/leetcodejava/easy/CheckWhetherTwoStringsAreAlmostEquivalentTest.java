package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class CheckWhetherTwoStringsAreAlmostEquivalentTest {

    @Test
    public void defaultTest() {
        assertFalse(
                new CheckWhetherTwoStringsAreAlmostEquivalent(
                        "aaaa",
                        "bccb"
                ).solution()
        );
    }

}
