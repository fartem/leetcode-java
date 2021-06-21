package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SplitAStringInBalancedStringsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new SplitAStringInBalancedStrings(
                        "RLRRLLRLRL"
                ).solution()
        );
    }

}
