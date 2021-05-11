package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "fl",
                new LongestCommonPrefix(
                        new String[]{"flower", "flow", "flight"}
                ).solution()
        );
    }

}
