package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecryptStringFromAlphabetToIntegerMappingTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "jkab",
                new DecryptStringFromAlphabetToIntegerMapping(
                        "10#11#12"
                ).solution()
        );
    }

}
