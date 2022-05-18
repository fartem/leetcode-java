package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumBitFlipsToConvertNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new MinimumBitFlipsToConvertNumber(10, 7).solution()
        );
    }

}
