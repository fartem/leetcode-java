package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestOddNumberInStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "5",
                new LargestOddNumberInString(
                        "52"
                ).solution()
        );
    }

}
