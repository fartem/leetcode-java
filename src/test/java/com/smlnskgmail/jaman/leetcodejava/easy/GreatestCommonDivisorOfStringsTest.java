package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreatestCommonDivisorOfStringsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "TAUXX",
                new GreatestCommonDivisorOfStrings(
                                "TAUXXTAUXXTAUXXTAUXXTAUXX",
                                "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX")
                        .solution());
    }
}
