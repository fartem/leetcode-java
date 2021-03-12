package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountTheNumberOfConsistentStringsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new CountTheNumberOfConsistentStrings(
                        "ab",
                        new String[]{"ad", "bd", "aaab", "baa", "badab"}
                ).solution()
        );
    }

}
