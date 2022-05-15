package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSuffixFlipsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new MinimumSuffixFlips("10111").solution()
        );
    }

}
