package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfGoodWaysToSplitAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new NumberOfGoodWaysToSplitAString("aacaba").solution()
        );
    }

}
