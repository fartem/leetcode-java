package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDigitFromNumberToMaximizeResultTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "12",
                new RemoveDigitFromNumberToMaximizeResult("123", '3').solution()
        );
    }

}
