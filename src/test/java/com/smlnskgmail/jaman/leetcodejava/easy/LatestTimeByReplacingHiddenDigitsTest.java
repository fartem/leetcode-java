package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LatestTimeByReplacingHiddenDigitsTest {

    @Test
    public void defaultTest() {
        assertEquals("23:50", new LatestTimeByReplacingHiddenDigits("2?:?0").solution());
    }
}
