package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountTheDigitsThatDivideANumberTest {

    @Test
    public void defaultTests() {
        assertEquals(1, new CountTheDigitsThatDivideANumber(7).solution());
        assertEquals(2, new CountTheDigitsThatDivideANumber(121).solution());
        assertEquals(4, new CountTheDigitsThatDivideANumber(1248).solution());
    }

}
