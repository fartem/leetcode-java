package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LatestTimeByReplacingHiddenDigitsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "23:50",
                new LatestTimeByReplacingHiddenDigits(
                        "2?:?0"
                ).solution()
        );
    }

}
