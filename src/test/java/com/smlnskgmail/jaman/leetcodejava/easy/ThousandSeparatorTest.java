package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThousandSeparatorTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "987",
                new ThousandSeparator(
                        987
                ).solution()
        );
    }

}
