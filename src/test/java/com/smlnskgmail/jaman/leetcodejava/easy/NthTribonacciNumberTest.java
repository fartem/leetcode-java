package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthTribonacciNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new NthTribonacciNumber(4).solution()
        );
    }

}
