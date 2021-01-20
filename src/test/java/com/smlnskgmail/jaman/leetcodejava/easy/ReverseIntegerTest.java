package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void defaultTest() {
        assertEquals(
                123,
                new ReverseInteger(321).solution()
        );
    }

}
