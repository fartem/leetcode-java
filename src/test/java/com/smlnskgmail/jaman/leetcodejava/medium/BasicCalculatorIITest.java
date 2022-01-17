package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicCalculatorIITest {

    @Test
    public void defaultTest() {
        assertEquals(7, new BasicCalculatorII("3+2*2").solution());
    }
}
