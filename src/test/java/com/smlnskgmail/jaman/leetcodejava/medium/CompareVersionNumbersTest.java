package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareVersionNumbersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                0,
                new CompareVersionNumbers(
                        "1.01",
                        "1.001"
                ).solution()
        );
    }

}
