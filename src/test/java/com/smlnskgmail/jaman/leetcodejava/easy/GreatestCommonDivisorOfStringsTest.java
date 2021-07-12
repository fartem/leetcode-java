package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorOfStringsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "TAUXX",
                new GreatestCommonDivisorOfStrings(
                        "TAUXXTAUXXTAUXXTAUXXTAUXX",
                        "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"
                ).solution()
        );
    }

}
