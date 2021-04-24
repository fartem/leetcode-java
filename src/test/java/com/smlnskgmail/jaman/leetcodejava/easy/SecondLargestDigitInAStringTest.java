package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecondLargestDigitInAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new SecondLargestDigitInAString(
                        "dfa12321afd"
                ).solution()
        );
    }

}
