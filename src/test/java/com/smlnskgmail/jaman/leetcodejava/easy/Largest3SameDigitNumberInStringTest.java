package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Largest3SameDigitNumberInStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "777",
                new Largest3SameDigitNumberInString("6777133339").solution()
        );
    }

}
