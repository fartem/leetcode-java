package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecryptStringFromAlphabetToIntegerMappingTest {

    @Test
    public void defaultTest() {
        assertEquals("jkab", new DecryptStringFromAlphabetToIntegerMapping("10#11#12").solution());
    }
}
