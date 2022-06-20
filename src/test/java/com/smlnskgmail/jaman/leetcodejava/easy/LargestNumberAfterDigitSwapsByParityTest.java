package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNumberAfterDigitSwapsByParityTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3412,
                new LargestNumberAfterDigitSwapsByParity(1234).solution()
        );
    }

}
