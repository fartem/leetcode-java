package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheKthFactorOfNTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new TheKthFactorOfN(12, 3).solution()
        );
    }

}
