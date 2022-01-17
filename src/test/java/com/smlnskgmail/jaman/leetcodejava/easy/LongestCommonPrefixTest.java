package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "fl",
                new LongestCommonPrefix(new String[] {"flower", "flow", "flight"}).solution());
    }
}
