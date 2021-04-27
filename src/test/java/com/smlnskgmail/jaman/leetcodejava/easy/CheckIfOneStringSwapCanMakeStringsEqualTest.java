package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfOneStringSwapCanMakeStringsEqualTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfOneStringSwapCanMakeStringsEqual(
                        "bank",
                        "kanb"
                ).solution()
        );
    }

}
