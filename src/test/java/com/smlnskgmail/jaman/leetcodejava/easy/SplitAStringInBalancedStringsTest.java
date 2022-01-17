package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SplitAStringInBalancedStringsTest {

    @Test
    public void defaultTest() {
        assertEquals(4, new SplitAStringInBalancedStrings("RLRRLLRLRL").solution());
    }
}
