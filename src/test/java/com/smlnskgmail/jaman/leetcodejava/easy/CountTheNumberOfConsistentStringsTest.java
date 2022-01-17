package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountTheNumberOfConsistentStringsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new CountTheNumberOfConsistentStrings(
                                "ab", new String[] {"ad", "bd", "aaab", "baa", "badab"})
                        .solution());
    }
}
