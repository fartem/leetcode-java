package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfAllAsAppearsBeforeAllBsTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfAllAsAppearsBeforeAllBs(
                        "aaabbb"
                ).solution()
        );
    }

}
