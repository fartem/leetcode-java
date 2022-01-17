package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThousandSeparatorTest {

    @Test
    public void defaultTest() {
        assertEquals("987", new ThousandSeparator(987).solution());
    }
}
