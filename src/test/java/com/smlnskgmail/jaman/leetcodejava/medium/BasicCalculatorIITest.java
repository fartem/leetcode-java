package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorIITest {

    @Test
    public void defaultTest() {
        assertEquals(
                7,
                new BasicCalculatorII("3+2*2").solution()
        );
    }

}
