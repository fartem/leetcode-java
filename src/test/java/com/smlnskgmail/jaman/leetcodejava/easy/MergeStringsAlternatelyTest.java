package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MergeStringsAlternatelyTest {

    @Test
    public void defaultTest() {
        assertEquals("apbqrs", new MergeStringsAlternately("ab", "pqrs").solution());
    }
}
