package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "9534330",
                new LargestNumber(new int[]{3, 30, 34, 5, 9}).solution()
        );
    }

}
