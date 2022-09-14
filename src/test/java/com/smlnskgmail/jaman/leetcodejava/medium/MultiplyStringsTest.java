package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyStringsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "6",
                new MultiplyStrings("2", "3").solution()
        );
    }

}
