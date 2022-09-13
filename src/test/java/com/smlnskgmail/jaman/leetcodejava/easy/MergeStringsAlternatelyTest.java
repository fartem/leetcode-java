package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeStringsAlternatelyTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "apbqrs",
                new MergeStringsAlternately("ab", "pqrs").solution()
        );
    }

}
