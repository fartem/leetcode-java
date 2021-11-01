package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthDistinctStringInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "a",
                new KthDistinctStringInAnArray(
                        new String[]{"d", "b", "c", "b", "c", "a"},
                        2
                ).solution()
        );
    }

}
