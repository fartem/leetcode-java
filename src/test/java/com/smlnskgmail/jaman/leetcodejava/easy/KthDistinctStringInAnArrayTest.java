package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthDistinctStringInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "a",
                new KthDistinctStringInAnArray(new String[] {"d", "b", "c", "b", "c", "a"}, 2)
                        .solution());
    }
}
