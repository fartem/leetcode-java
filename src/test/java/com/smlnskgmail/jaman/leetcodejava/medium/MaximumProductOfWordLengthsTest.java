package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProductOfWordLengthsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                16,
                new MaximumProductOfWordLengths(
                        new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}
                ).solution()
        );
    }

}
