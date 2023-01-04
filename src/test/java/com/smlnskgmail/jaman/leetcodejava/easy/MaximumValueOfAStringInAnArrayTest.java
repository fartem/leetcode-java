package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumValueOfAStringInAnArrayTest {

    @Test
    public void defaultTests() {
        assertEquals(
                5,
                new MaximumValueOfAStringInAnArray(
                        new String[]{"alic3", "bob", "3", "4", "00000"}
                ).solution()
        );
        assertEquals(
                1,
                new MaximumValueOfAStringInAnArray(
                        new String[]{"1", "01", "001", "0001"}
                ).solution()
        );
    }

}
